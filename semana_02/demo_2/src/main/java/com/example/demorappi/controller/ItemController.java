package com.example.demorappi.controller;

import com.example.demorappi.domain.Item;
import com.example.demorappi.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/items")
public class ItemController {
    @Autowired
    ItemService service;

    @GetMapping
    public ResponseEntity<List<Item>> items() {
        List<Item> items = service.items();

        return new ResponseEntity<>(items, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createItem(@RequestBody Item item) {
        service.createItem(item);

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
