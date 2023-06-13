package br.com.gamesporgamers.entity;

import java.util.ArrayList;
import java.util.List;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class SubCategory extends PanacheEntity {

    @ManyToMany(cascade = {
            CascadeType.PERSIST,
            CascadeType.MERGE
    })
    @JoinTable(name = "category_subcategory", joinColumns = @JoinColumn(name = "category_id"), inverseJoinColumns = @JoinColumn(name = "subcategory_id"))
    private ArrayList<Category> categories = new ArrayList<>();

    @ManyToMany(mappedBy = "subCategories")
    private List<Post> posts = new ArrayList<>();

    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Category> getCategories() {
        return this.categories;
    }

    public void setCategories(ArrayList<Category> categories) {
        this.categories = categories;
    }

    public static void add(String name, ArrayList<Category> categories) {
        SubCategory subCategory = new SubCategory();
        subCategory.name = name;
        subCategory.categories = categories;
        subCategory.persist();
    }

}
