package com.example.demorappi.controller;

import com.example.demorappi.domain.Category;
import com.example.demorappi.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/categories")
public class CategoryController {
    @Autowired
    CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> categories() {
        List<Category> categories = service.categories();

        return new ResponseEntity<>(categories, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createCategory(@RequestBody Category category) {
        service.createCategory(category);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
