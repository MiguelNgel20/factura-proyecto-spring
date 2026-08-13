package com.miguel.proyecto.springboot.di.factura.springboot_difactura.models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
public class Invoice {

    @Autowired
    private Client client;


    @Value("${invoice.description.office}")
    private String description;
    
    @Autowired
    @Qualifier("ItemsOficina")
    private List<Item> items;

    @PostConstruct
    public void init(){
        description = description.concat(" para cliente").concat(": ").concat(client.getName());
    }

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int totalValue(){
        return items.stream().mapToInt(item -> item.getTotalValue()).sum();
    }

    
}
