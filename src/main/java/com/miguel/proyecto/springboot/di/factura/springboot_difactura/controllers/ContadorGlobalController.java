package com.miguel.proyecto.springboot.di.factura.springboot_difactura.controllers;

import org.springframework.web.bind.annotation.RestController;

import com.miguel.proyecto.springboot.di.factura.springboot_difactura.ContadorGlobal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ContadorGlobalController {

    @Autowired
    private ContadorGlobal contadorGlobal;

    @GetMapping("/registrar")
        public void registrarPeticion(){

            contadorGlobal.aumentarContador();

        }
    }
    



