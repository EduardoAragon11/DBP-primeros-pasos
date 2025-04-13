package com.example.demorappi.service;

import com.example.demorappi.domain.Category;
import com.example.demorappi.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository repository;

    public List<Category> categories() {
        return repository.findAll();
    }

    public void createCategory(Category category) {
        repository.save(category);
    }
}
