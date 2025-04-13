package com.example.demorappi.controller;

import com.example.demorappi.domain.Menu;
import com.example.demorappi.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/menus")
public class MenuController {
    @Autowired
    MenuService service;

    @GetMapping
    public ResponseEntity<List<Menu>> menus() {
        List<Menu> menus = service.menus();

        return new ResponseEntity<>(menus, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Void> createMenu(@RequestBody Menu menu) {
        service.createMenu(menu);

        return  new ResponseEntity<>(HttpStatus.CREATED);
    }
}
