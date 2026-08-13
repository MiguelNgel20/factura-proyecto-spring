package com.miguel.proyecto.springboot.di.factura.springboot_difactura;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
public class ContadorGlobal {
    private int contadorGlobal = 0;


    @PostConstruct
    public void init(){
        System.out.println("Contador global: " + contadorGlobal);
    }

    public void aumentarContador(){
        contadorGlobal++;
    }

    @PreDestroy
    public void reporte(){
        System.out.println("Cerrando la app, total de peticiones hechas: " + contadorGlobal);
    }


}
