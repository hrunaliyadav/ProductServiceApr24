package com.example.FirstAPI.services;

import com.example.FirstAPI.models.Product;

import java.util.List;

public interface ProductService {
    public Product getProductById(long id);
    public List<Product> getAllProduct();
}
