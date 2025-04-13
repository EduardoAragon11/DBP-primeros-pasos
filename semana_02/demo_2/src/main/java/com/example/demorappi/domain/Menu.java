package com.example.demorappi.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Menu {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    @OneToMany
    List<Item> items;

    public Menu() {
    }

    public Menu(Integer id, List<Item> items) {
        this.id = id;
        this.items = items;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
