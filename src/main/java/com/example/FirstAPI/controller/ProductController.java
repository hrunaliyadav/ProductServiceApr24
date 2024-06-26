package com.example.FirstAPI.controller;


import com.example.FirstAPI.models.Product;
import com.example.FirstAPI.services.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable("id") long id){
        return productService.getProductById(id);
    }

    public List<Product> getProducts(){
        return new ArrayList<>();
    }


}