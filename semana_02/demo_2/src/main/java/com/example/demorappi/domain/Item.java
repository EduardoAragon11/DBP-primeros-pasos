package com.example.demorappi.domain;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String name;

    String description;

    String sku;

    String type;

    Double price;

    @ManyToOne
    Category category;

    String imageUrl;

    @ManyToMany
    List<Item> children;

    public Item() {
    }

    public Item(Integer id, String name, String description, String sku, String type, Double price, Category category, String imageUrl, List<Item> children) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.sku = sku;
        this.type = type;
        this.price = price;
        this.category = category;
        this.imageUrl = imageUrl;
        this.children = children;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Item> getChildren() {
        return children;
    }

    public void setChildren(List<Item> children) {
        this.children = children;
    }
}
