package br.com.gamesporgamers.entity;

import java.util.ArrayList;
import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;

@Entity
public class Category extends PanacheEntity {

    @ManyToMany(mappedBy = "categories")
    private List<SubCategory> subCategories = new ArrayList<>();

    private String name;

    public List<SubCategory> getSubCategories() {
        return this.subCategories;
    }

    public void setSubCategories(List<SubCategory> subCategories) {
        this.subCategories = subCategories;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void add(String name) {
        Category category = new Category();
        category.name = name;
        category.persist();
    }

}
