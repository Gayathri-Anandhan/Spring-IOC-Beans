package com.example.productcatelog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.productcatelog.entity.product;
import com.example.productcatelog.service.productservice;

@Controller
public class productcontroller {
    @Autowired
    private productservice productservice;

    // Home page
    @GetMapping("/")
    public String home() {
        return "index";
    }

    // Show Add Product form
    @GetMapping("/add-product")
    public String showAddProductForm(Model model) {
        model.addAttribute("product", new product());
        return "addProduct";
    }

    // Save product
    @PostMapping("/save-product")
    public String saveProduct(@ModelAttribute product product) {
        productservice.saveProduct(product);
        return "redirect:/displayproducts";
    }

    // Display all products
    @GetMapping("/displayproducts")
    public String displayproducts(Model model) {
        model.addAttribute("products", productservice.getAllProducts());
        return "displayproducts";
    }

}
