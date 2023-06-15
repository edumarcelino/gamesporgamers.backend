package br.com.gamesporgamers;

import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import jakarta.transaction.Transactional;

import java.util.ArrayList;
import java.util.List;

import br.com.gamesporgamers.entity.Category;
import br.com.gamesporgamers.entity.SubCategory;
import br.com.gamesporgamers.entity.User;
import br.com.gamesporgamers.service.CategoryService;
import br.com.gamesporgamers.service.SubCategoryService;
import io.quarkus.runtime.StartupEvent;

@Singleton
public class Startup {

    @Inject
    CategoryService categoryService;

    @Inject
    SubCategoryService subCategoryService;

    @Transactional
    public void loadUsers(@Observes StartupEvent evt) {

        List<User> users = new ArrayList<>();

        users.add(new User("admin", "password@2305", "admin"));
        users.add(new User("user", "password@2305", "user"));

        for (User user : users) {
            if (!User.exists(user.getUsername())) {
                User.add(user.getUsername(), user.getPassword(), user.getRole());
            }
        }

    }

    @Transactional
    public void loadCategoriesAndSubCategories(@Observes StartupEvent evt) {

        // Primeiro cadastro as categorias
        List<String> categoriesName = new ArrayList<String>();

        categoriesName.add("X-Box");
        categoriesName.add("Playstation");
        categoriesName.add("Switch");
        categoriesName.add("PC");
        categoriesName.add("Portátil");
        categoriesName.add("Celular");

        // Valida se a categoria já existe ou não
        for (String categoryName : categoriesName) {
            Category category = new Category();
            category.setName(categoryName);
            categoryService.addCategory(category);
        }

        List<Category> categories = categoryService.getAllCategories();

        List<String> subCategoriesName = new ArrayList<String>();
        subCategoriesName.add("Notícias");
        subCategoriesName.add("Análises");
        subCategoriesName.add("Vídeos");
        subCategoriesName.add("Artigos");
        subCategoriesName.add("Promoções");

        for (String subCategoryName : subCategoriesName) {
            SubCategory subCategory = new SubCategory();
            subCategory.setName(subCategoryName);
            subCategory.setCategories(categories);
            subCategoryService.addSubCategory(subCategory);
        }

    }

}
