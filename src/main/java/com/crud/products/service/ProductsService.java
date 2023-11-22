package com.crud.products.service;

import com.crud.products.model.ProductModel;
import com.crud.products.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsService {

    @Autowired
    private ProductRepository productRepository;

    public List<ProductModel> getAllProducts() {
        return this.productRepository.findAll();
    }

}
