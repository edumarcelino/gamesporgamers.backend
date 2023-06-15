package br.com.gamesporgamers.entity;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Entity;

import jakarta.persistence.ManyToMany;

@Entity
public class SubCategory extends PanacheEntity {

    private String name;

    @ManyToMany
    @JsonIgnore
    private List<Category> categories;

    @ManyToMany
    @JsonIgnore
    private List<Post> posts = new ArrayList<>();

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public List<Post> getPosts() {
        return this.posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }

    public SubCategory(List<Category> categories, String name) {
        this.categories = categories;
        this.name = name;
    }

    public SubCategory() {
    }

}
