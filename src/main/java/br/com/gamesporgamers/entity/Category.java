package br.com.gamesporgamers.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

import jakarta.persistence.Entity;


import jakarta.persistence.ManyToMany;

@Entity
public class Category extends PanacheEntity {

    @JsonProperty("name")
    private String name;

    @ManyToMany(mappedBy = "categories")
    @JsonProperty("subcategories")
    private List<SubCategory> subCategories;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<SubCategory> getSubCategories() {
        return this.subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

}
