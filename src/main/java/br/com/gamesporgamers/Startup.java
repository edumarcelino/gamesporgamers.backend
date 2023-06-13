package br.com.gamesporgamers;

import jakarta.enterprise.event.Observes;
import jakarta.inject.Singleton;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

import br.com.gamesporgamers.entity.Category;
import br.com.gamesporgamers.entity.User;
import io.quarkus.runtime.StartupEvent;

@Singleton
public class Startup {

    @Transactional
    public void loadUsers(@Observes StartupEvent evt) {
        // reset and load all test users
        User.deleteAll();
        User.add("admin", "admin", "admin");
        User.add("user", "user", "user");
    }

    @Transactional
    public void loadCategoriesSubCategories(@Observes StartupEvent evt) {

        List<Category> categories = Category.listAll();
        List<String> categoriesName = new ArrayList<String>();

        categoriesName.add("X-Box");
        categoriesName.add("Playstation");
        categoriesName.add("Switch");
        categoriesName.add("PC");
        categoriesName.add("Portátil");
        categoriesName.add("Celular");

        // reset and load all test users
        Category.deleteAll();
        Category.add("X-Box");
        Category.add("Playstation");
        Category.add("Switch");
        Category.add("PC");
        Category.add("Portátil");
        Category.add("Celular");
    }

}