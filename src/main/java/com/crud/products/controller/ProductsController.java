package com.crud.products.controller;

import com.crud.products.dtos.ProductDTO;
import com.crud.products.model.ProductModel;
import com.crud.products.repository.ProductRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductsController {

    @Autowired
    private ProductRepository productRepository;

    @PostMapping("/products")
    public ResponseEntity<ProductModel> saveProduct(@RequestBody ProductDTO productDTO){
        var productModel = new ProductModel();
        BeanUtils.copyProperties(productModel, productModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModel));
    }
}
