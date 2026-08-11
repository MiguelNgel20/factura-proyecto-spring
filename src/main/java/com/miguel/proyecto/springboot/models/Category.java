package com.miguel.proyecto.springboot.models;

import org.springframework.stereotype.Component;

@Component
public class Category {
    private String name;
    private String description;


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


    

}
