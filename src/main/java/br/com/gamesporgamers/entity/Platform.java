package br.com.gamesporgamers.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

@Entity
public class Platform extends PanacheEntity {

    @JsonProperty("name")
    private String name;

    private Boolean visible;

    // Relacionamento many-to-many com Post
    @ManyToMany(mappedBy = "platforms")
    @JsonIgnore
    private List<Post> posts;

    public Platform() {
    }

    public Platform(String name, Boolean visible) {
        this.name = name;
        this.visible = visible;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Post> getPosts() {
        return this.posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public Boolean isVisible() {
        return this.visible;
    }

    public Boolean getVisible() {
        return this.visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

}
