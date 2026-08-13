package com.miguel.proyecto.springboot.di.factura.springboot_difactura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.miguel.proyecto.springboot.di.factura.springboot_difactura.models.Category;
import com.miguel.proyecto.springboot.di.factura.springboot_difactura.models.Item;
import com.miguel.proyecto.springboot.di.factura.springboot_difactura.models.Product;

@Configuration
public class AppConfig {

    @Bean("Default")
    public List<Item> itemsInvoice(){
    Product p1 = new Product(15000, "Keyboard", new Category("Tech", "Peripheral"));
    List<Item> itemsList = Arrays.asList((new Item(p1, 2)), new Item(new Product(20000, "Mouse", new Category("Tech", "Peripheral")), 2));

    return itemsList;
    }

    @Bean("ItemsOficina")
    @Primary
    public List<Item> itemsInvoiceOficina(){
    Product p1 = new Product(15000, "Monitor ASUS", new Category("Tech", "Not desc"));
    List<Item> itemsList = Arrays.asList((new Item(p1, 4)), new Item(new Product(20000, "Mousepad", new Category("Tech", "Tech")), 2));

    return itemsList;
    }

}
