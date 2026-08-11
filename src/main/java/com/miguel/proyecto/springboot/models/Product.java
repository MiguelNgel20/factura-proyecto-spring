package com.miguel.proyecto.springboot.models;

import java.util.Locale.Category;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
    private int price;
    private String name;

    @Autowired
    private com.miguel.proyecto.springboot.models.Category category;


    public int getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public com.miguel.proyecto.springboot.models.Category getCategory() {
        return category;
    }
    public void setCategory(com.miguel.proyecto.springboot.models.Category category) {
        this.category = category;
    }


    




}
