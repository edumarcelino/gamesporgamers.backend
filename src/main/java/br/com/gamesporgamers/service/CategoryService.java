package br.com.gamesporgamers.service;

import java.util.List;

import br.com.gamesporgamers.entity.Category;
import br.com.gamesporgamers.repository.CategoryRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class CategoryService {

    @Inject
    CategoryRepository categoryRepository;

    public List<Category> getAllCategories() {
        return categoryRepository.listAllOrderedByName();
    }

    public Category getCategoryById(Long subCategoryId) {
        return categoryRepository.findById(subCategoryId);
    }

    public void addCategory(Category Category) {
        categoryRepository.persist(Category);
    }

    public void deleteCategory(Category category) {
        categoryRepository.delete(category);
    }

    public void updateCategory(Category category) {
        categoryRepository.persistAndFlush(category);
    }

}