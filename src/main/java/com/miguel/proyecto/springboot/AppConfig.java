package com.miguel.proyecto.springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.miguel.proyecto.springboot.models.Category;
import com.miguel.proyecto.springboot.models.Item;
import com.miguel.proyecto.springboot.models.Product;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

    @Bean
    public List<Item> itemsInvoice(){
    Product p1 = new Product(15000, "Keyboard", new Category("Tech", "Peripheral"));
    List<Item> itemsList = Arrays.asList((new Item(p1, 2)));

    return itemsList;
    }

}
