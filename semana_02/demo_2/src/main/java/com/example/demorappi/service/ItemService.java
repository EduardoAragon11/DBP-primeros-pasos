package com.example.demorappi.service;

import com.example.demorappi.domain.Item;
import com.example.demorappi.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {
    @Autowired
    ItemRepository repository;

    public List<Item> items() {
        return repository.findAll();
    }

    public void createItem(Item item) {
        repository.save(item);
    }
}
