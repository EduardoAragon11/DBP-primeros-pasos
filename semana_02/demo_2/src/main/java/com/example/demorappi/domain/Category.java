package com.example.demorappi.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/*
"category": {
  "id": "3",
  "name": "Tortas",
  "minQty": 0,
  "maxQty": 0,
  "sortingPosition": 0
},
* */
@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;

    String name;

    Integer minQty;

    Integer maxQty;

    Integer sortingPosition;

    public Category() {
    }

    public Category(Integer id, String name, Integer minQty, Integer maxQty, Integer sortingPosition) {
        this.id = id;
        this.name = name;
        this.minQty = minQty;
        this.maxQty = maxQty;
        this.sortingPosition = sortingPosition;
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

    public Integer getMinQty() {
        return minQty;
    }

    public void setMinQty(Integer minQty) {
        this.minQty = minQty;
    }

    public Integer getMaxQty() {
        return maxQty;
    }

    public void setMaxQty(Integer maxQty) {
        this.maxQty = maxQty;
    }

    public Integer getSortingPosition() {
        return sortingPosition;
    }

    public void setSortingPosition(Integer sortingPosition) {
        this.sortingPosition = sortingPosition;
    }
}
