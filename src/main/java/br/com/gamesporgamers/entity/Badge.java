package br.com.gamesporgamers.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

@Entity
public class Badge extends PanacheEntity {

    @JsonProperty("name")
    private String name;

    // Relacionamento many-to-many com Post
    @ManyToMany(mappedBy = "badges")
    @JsonIgnore
    private List<Post> posts;

    public Badge() {
    }

    public Badge(String name, List<Post> posts) {
        this.name = name;
        this.posts = posts;
    }

    public Badge(String name) {
        this.name = name;
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

}
