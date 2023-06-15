package br.com.gamesporgamers.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Comment extends PanacheEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToMany(mappedBy = "comment", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserRatingComment> userRatingsComment = new ArrayList<>();

    private String textComment;

    private Date dateComment;

    @ManyToOne
    private Comment replyToComment;

    public Post getPost() {
        return this.post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTextComment() {
        return this.textComment;
    }

    public void setTextComment(String textComment) {
        this.textComment = textComment;
    }

    public Date getDateComment() {
        return this.dateComment;
    }

    public void setDateComment(Date dateComment) {
        this.dateComment = dateComment;
    }

    public Comment getReplyToComment() {
        return this.replyToComment;
    }

    public void setReplyToComment(Comment replyToComment) {
        this.replyToComment = replyToComment;
    }

    public List<UserRatingComment> getUserRatingsComment() {
        return this.userRatingsComment;
    }

    public void setUserRatingsComment(List<UserRatingComment> userRatingsComment) {
        this.userRatingsComment = userRatingsComment;
    }

}
