package com.miguel.proyecto.springboot.di.factura.springboot_difactura.models;

public class Item {

    private Product product;
    private int quantity;
    private int totalValue;

    public Item(){

    }

    public Item(Product product, int quantity){
        this.product = product;
        this.quantity = quantity;
        totalValue = product.getPrice() * quantity;
    }
    
    public Product getProduct() {
        return product;
    }
    public void setProduct(Product product) {
        this.product = product;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getTotalValue(){
        return totalValue;
    }
}
