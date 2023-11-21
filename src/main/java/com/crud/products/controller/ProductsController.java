package com.crud.products.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductsController {

    @GetMapping
    public ResponseEntity findAll(){
        return ResponseEntity.ok("Matheus deu certo paiii");
    }
}
