package br.com.gamesporgamers.service;

import java.util.List;

import br.com.gamesporgamers.entity.SubCategory;
import br.com.gamesporgamers.repository.SubCategoryRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class SubCategoryService {

    @Inject
    SubCategoryRepository subCategoryRepository;

    public List<SubCategory> getAllSubCategories() {
        return subCategoryRepository.listAllOrderedByName();
    }

    public SubCategory getSubCategoryById(Long subCategoryId) {
        return subCategoryRepository.findById(subCategoryId);
    }

    public void addSubCategory(SubCategory subCategory) {
        subCategoryRepository.persist(subCategory);
    }

    public void deleteCategory(SubCategory subCategory) {
        subCategoryRepository.delete(subCategory);
    }

    public void updateCategory(SubCategory subCategory) {
        subCategoryRepository.persistAndFlush(subCategory);
    }

}