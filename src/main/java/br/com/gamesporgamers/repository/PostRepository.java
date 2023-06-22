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
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

@ApplicationScoped
public class PostRepository implements PanacheRepository<Post> {

    @Inject
    CommentRepository commentRepository;

    @Inject
    BadgeRepository badgeRepository;

    public List<Post> listAllOrderedByDate() {
        return this.listAll(Sort.by("datePost").descending());
    }

    public List<Post> listLastFiveOrderedByDate() {
        return find("ORDER BY datePost DESC").page(0, 5).list();
    }

    public List<Post> getPostsByBadgesOrderedByDate(List<String> badgesName, int page, int size) {
        List<Post> posts = new ArrayList<>();

        List<Post> listLastFiveOrderedByDate = listLastFiveOrderedByDate();

        List<Badge> badges = badgeRepository.findByNames(badgesName);

        CriteriaBuilder cb = getEntityManager().getCriteriaBuilder();
        CriteriaQuery<Post> query = cb.createQuery(Post.class);
        Root<Post> root = query.from(Post.class);

        query.select(root)
                .where(root.join("badges").in(badges))
                .orderBy(cb.desc(root.get("datePost")));

        TypedQuery<Post> typedQuery = getEntityManager().createQuery(query);

        // Obter a lista de Posts
        List<Post> resultList = typedQuery.getResultList();

        // Remover os Posts da lista listLastFiveOrderedByDate
        resultList.removeAll(listLastFiveOrderedByDate);

        // Obter o número total de resultados
        int totalResults = resultList.size();

        // Calcular o número total de páginas
        int totalPages = (int) Math.ceil((double) totalResults / size);

        // Ajustar a página se for inválida
        if (page < 1) {
            page = 1;
        } else if (page > totalPages) {
            page = totalPages;
        }

        // Calcular o offset e definir os limites da consulta
        int offset = (page - 1) * size;
        if (offset < 0) {
            offset = 0;
        }

        // Definir os Posts da página atual
        posts = resultList.subList(offset, Math.min(offset + size, resultList.size()));

        return posts;
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
