package br.com.gamesporgamers.repository;

import java.util.ArrayList;
import java.util.List;

import br.com.gamesporgamers.entity.Badge;
import br.com.gamesporgamers.entity.Post;
import br.com.gamesporgamers.entity.User;
import br.com.gamesporgamers.entity.enumTypes.PostRatingEnum;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Join;
import jakarta.persistence.criteria.Root;

@ApplicationScoped
public class PostRepository implements PanacheRepository<Post> {

    @Inject
    CommentRepository commentRepository;

    public List<Post> listAllOrderedByDate() {
        return this.listAll(Sort.by("datePost").descending());
    }

    public List<Post> listLastFiveOrderedByDate() {
        return find("ORDER BY datePost DESC").page(0, 5).list();
    }

    public List<Post> getPostsByBadgesOrderedByDate(List<Badge> badges) {
        List<Post> postsByBadgesOrderedByDate = new ArrayList<>();
        List<Post> listLastFive = listLastFiveOrderedByDate();

        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Post> query = cb.createQuery(Post.class);
        Root<Post> postRoot = query.from(Post.class);
        Join<Post, Badge> badgeJoin = postRoot.join("badges");

        query.select(postRoot)
                .where(badgeJoin.in(badges))
                .orderBy(cb.desc(postRoot.get("datePost")));

        postsByBadgesOrderedByDate = getEntityManager().createQuery(query).getResultList();

        // Remover os posts da lista listLastFive
        for (Post post : listLastFive) {
            postsByBadgesOrderedByDate.remove(post);
        }

        return postsByBadgesOrderedByDate;
    }

    public List<Post> findByKeyword(String keyword) {
        String keywordPattern = "%" + keyword + "%";
        return find("postText like ?1", keywordPattern).list();
    }

    public List<Post> findByUser(User user) {
        return find("user = ?1", user).list();
    }

    // Responsável por realizar a contagem de comentários do post
    public int countComments(Long postId) {
        return commentRepository.find("post.id", postId).list().size();
    }

    // Responsável por realizar a contagem dos likes do post
    public int countLikes(Long postId) {
        return Math.toIntExact(count("id = ?1 and userRatingPosts.postRating = ?2", postId, PostRatingEnum.LIKE));
    }

    // Responsável por realizar a contagem dos dislikes do post
    public int countDislikes(Long postId) {
        return Math.toIntExact(count("id = ?1 and userRatingPosts.postRating = ?2", postId, PostRatingEnum.DISLIKE));
    }

}
