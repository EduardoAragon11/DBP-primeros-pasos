package com.example.demorappi.service;

import com.example.demorappi.domain.Menu;
import com.example.demorappi.repository.MenuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuService {
    @Autowired
    MenuRepository repository;

    public List<Menu> menus() {
        return repository.findAll();
    }

    public void createMenu(Menu menu) {
        repository.save(menu);
    }
}
