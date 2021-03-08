package com.rensilver.crud.apicovidvacinationlist.controller;

import com.rensilver.crud.apicovidvacinationlist.entities.Category;
import com.rensilver.crud.apicovidvacinationlist.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping
    public List<Category> findAllCategories() {
        return service.findAll();
    }

    @GetMapping(value = "/{id}")
    public Category findById(@PathVariable Integer id) {
        return service.findById(id);
    }

    @PostMapping
    public Category insert(@RequestBody Category category) {
        return service.insert(category);
    }

    @PutMapping(value = "/{id}")
    public Category update(@PathVariable Integer id, @RequestBody Category category) {
        category = service.update(id, category);
        return category;
    }
}
