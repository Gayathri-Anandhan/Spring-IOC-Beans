package com.example.productcatelog.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.productcatelog.entity.product;
import com.example.productcatelog.repository.productrepository;

@Service
public class productservice {
    @Autowired
    private productrepository productRepository;

    public void saveProduct(product product) {
        productRepository.save(product);
    }

    public List<product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<product> getProductsByCategory(String category) {
        return productRepository.findByCategory(category);
    }
}

