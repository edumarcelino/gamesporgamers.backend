package br.com.gamesporgamers.entity;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToOne;

@Entity
public class Image extends PanacheEntity {

    @ManyToOne(fetch = FetchType.LAZY)
    private Post post;

    private String subtitle;

    private String urlImage;

    private Integer widthImage;

    private Integer heightImage;

    public Post getPost() {
        return this.post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public String getSubtitle() {
        return this.subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getUrlImage() {
        return this.urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public Integer getWidthImage() {
        return this.widthImage;
    }

    public void setWidthImage(Integer widthImage) {
        this.widthImage = widthImage;
    }

    public Integer getHeightImage() {
        return this.heightImage;
    }

    public void setHeightImage(Integer heightImage) {
        this.heightImage = heightImage;
    }

}
