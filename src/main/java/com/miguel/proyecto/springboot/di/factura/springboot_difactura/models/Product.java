package com.miguel.proyecto.springboot.di.factura.springboot_difactura.models;


import org.springframework.beans.factory.annotation.Autowired;



public class Product {
    private int price;
    private String name;
    @Autowired
    private com.miguel.proyecto.springboot.di.factura.springboot_difactura.models.Category category;


    public Product(){
        
    }


    public Product(int price, String name, Category category){
        this.price = price;
        this.name = name;
        this.category = category;

    }




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
    public com.miguel.proyecto.springboot.di.factura.springboot_difactura.models.Category getCategory() {
        return category;
    }
    public void setCategory(com.miguel.proyecto.springboot.di.factura.springboot_difactura.models.Category category) {
        this.category = category;
    }


    




}
