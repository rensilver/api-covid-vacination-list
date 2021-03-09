package com.rensilver.crud.apicovidvacinationlist.services;

import com.rensilver.crud.apicovidvacinationlist.entities.Category;
import com.rensilver.crud.apicovidvacinationlist.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public List<Category> findAll() {
       return categoryRepository.findAll();
    }

    @Transactional(readOnly = true)
    public Category findById(Integer id) {
        Optional<Category> obj = categoryRepository.findById(id);
        Category entity = obj.orElseThrow(() -> new RuntimeException("Category not found"));
        return new Category(entity);
    }

    @Transactional
    public Category insert(Category entity) {
        Category category = new Category();
        category.setName(entity.getName());
        entity = categoryRepository.save(entity);
        return new Category(entity);
    }

    @Transactional
    public Category update(Integer id, Category entity) {
        Category category = categoryRepository.getOne(id);
        category.setName(entity.getName());
        return new Category(category);
    }

    public void delete(Integer id) {
        categoryRepository.deleteById(id);
    }
}
