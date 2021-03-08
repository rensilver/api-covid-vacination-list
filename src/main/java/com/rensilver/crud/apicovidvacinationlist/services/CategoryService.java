package com.rensilver.crud.apicovidvacinationlist.services;

import com.rensilver.crud.apicovidvacinationlist.entities.Category;
import com.rensilver.crud.apicovidvacinationlist.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Transactional(readOnly = true)
    public List<Category> findAll() {
       return categoryRepository.findAll();
    }
}
