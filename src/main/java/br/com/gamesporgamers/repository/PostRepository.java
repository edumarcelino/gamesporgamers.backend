package br.com.gamesporgamers.repository;

import java.util.List;

import br.com.gamesporgamers.entity.Post;
import br.com.gamesporgamers.entity.User;
import br.com.gamesporgamers.entity.enumTypes.PostRatingEnum;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.panache.common.Sort;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class PostRepository implements PanacheRepository<Post> {

    @Inject
    CommentRepository commentRepository;

    public List<Post> listAllOrderedByDate() {
        return this.listAll(Sort.by("datePost").descending());
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
