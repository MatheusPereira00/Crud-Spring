package com.crud.products.controller;

import com.crud.products.dtos.ProductDTO;
import com.crud.products.model.ProductModel;
import com.crud.products.repository.ProductRepository;
import com.crud.products.service.ProductsService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductsController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductsService productsService;

    @PostMapping("/products")
    public ResponseEntity<ProductModel> saveProduct(@RequestBody ProductDTO productDTO){
        var productModel = new ProductModel();
        BeanUtils.copyProperties(productDTO, productModel);
        return ResponseEntity.status(HttpStatus.CREATED).body(productRepository.save(productModel));
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductModel>> getAllProducts(){
        List<ProductModel> products = this.productsService.getAllProducts();
        return new ResponseEntity<>(products, HttpStatus.OK);
    }

}
