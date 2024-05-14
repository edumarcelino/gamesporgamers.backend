package br.com.gamesporgamers.entity;

import br.com.gamesporgamers.entity.enumTypes.PostRatingEnum;
import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

@Entity
public class UserRatingPost extends PanacheEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

    @Enumerated(EnumType.STRING)
    private PostRatingEnum postRating;

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Post getPost() {
        return this.post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public PostRatingEnum getPostRating() {
        return this.postRating;
    }

    public void setPostRating(PostRatingEnum postRating) {
        this.postRating = postRating;
    }

}
