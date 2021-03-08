package com.rensilver.crud.apicovidvacinationlist.controller;

import com.rensilver.crud.apicovidvacinationlist.entities.Category;
import com.rensilver.crud.apicovidvacinationlist.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/categories")
public class CategoryController {

    @Autowired
    private CategoryService service;

    @GetMapping("/all")
    public Iterable<Category> findAllCategories() {
        return service.findAll();
    }
}
