package br.com.gamesporgamers.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Post extends PanacheEntity {

    private String title;

    @Column(columnDefinition = "TEXT")
    private String postText;

    @Column(columnDefinition = "TEXT")
    private String postTextHTML;

    private Date datePost;

    private boolean highlighted;

    @ManyToOne(fetch = FetchType.LAZY)
    private User user;

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Comment> comments = new ArrayList<>();

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Image> images = new ArrayList<>();

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Video> videos = new ArrayList<>();

    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<UserRatingPost> userRatingsPost = new ArrayList<>();

    // TODO: Rever essa ligação, um post possui categoria e subcategoria.
    @ManyToMany(mappedBy = "posts", fetch = FetchType.LAZY)
    @JsonProperty("subcategories")
    private List<SubCategory> subCategories;

    public String getPostText() {
        return this.postText;
    }

    public void setPostText(String postText) {
        this.postText = postText;
    }

    public String getPostTextHTML() {
        return this.postTextHTML;
    }

    public void setPostTextHTML(String postTextHTML) {
        this.postTextHTML = postTextHTML;
    }

    public Date getDatePost() {
        return this.datePost;
    }

    public void setDatePost(Date datePost) {
        this.datePost = datePost;
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public List<SubCategory> getSubCategories() {
        return this.subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

    public boolean isHighlighted() {
        return this.highlighted;
    }

    public boolean getHighlighted() {
        return this.highlighted;
    }

    public void setHighlighted(boolean highlighted) {
        this.highlighted = highlighted;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Image> getImages() {
        return this.images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Video> getVideos() {
        return this.videos;
    }

    public void setVideos(List<Video> videos) {
        this.videos = videos;
    }

    public List<UserRatingPost> getUserRatingsPost() {
        return this.userRatingsPost;
    }

    public void setUserRatingsPost(List<UserRatingPost> userRatingsPost) {
        this.userRatingsPost = userRatingsPost;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
