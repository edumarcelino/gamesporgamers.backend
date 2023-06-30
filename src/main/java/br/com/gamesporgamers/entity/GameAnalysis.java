package br.com.gamesporgamers.entity;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;

import jakarta.persistence.ManyToOne;

@Entity
public class GameAnalysis extends PanacheEntity {

    private String title;

    private String description;

    @Column(columnDefinition = "TEXT")
    private String postTextHTML;

    private Date releaseDate;

    private Date datePost;

    private String urlImage;

    private String platforms;

    public double average;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnore
    private User user;

    public GameAnalysis() {
    }

    public GameAnalysis(String title, String description, String postTextHTML, Date releaseDate, Date datePost,
            String urlImage, String platforms, double average, User user) {
        this.title = title;
        this.description = description;
        this.postTextHTML = postTextHTML;
        this.releaseDate = releaseDate;
        this.datePost = datePost;
        this.urlImage = urlImage;
        this.platforms = platforms;
        this.average = average;
        this.user = user;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPostTextHTML() {
        return this.postTextHTML;
    }

    public void setPostTextHTML(String postTextHTML) {
        this.postTextHTML = postTextHTML;
    }

    public Date getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public Date getDatePost() {
        return this.datePost;
    }

    public void setDatePost(Date datePost) {
        this.datePost = datePost;
    }

    public String getUrlImage() {
        return this.urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getPlatforms() {
        return this.platforms;
    }

    public void setPlatforms(String platforms) {
        this.platforms = platforms;
    }

    public double getAverage() {
        return this.average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
