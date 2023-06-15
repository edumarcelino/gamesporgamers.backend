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

    public Category getCategoryById(Long categoryId) {
        return categoryRepository.findById(categoryId);
    }

    public void addCategory(Category category) {
        categoryRepository.persist(category);
    }

    public void deleteCategory(Category category) {
        categoryRepository.delete(category);
    }

    public void updateCategory(Category category) {
        categoryRepository.persistAndFlush(category);
    }

}