package com.example.FirstAPI.services;

import com.example.FirstAPI.dtos.FakeProductServiceDto;
import com.example.FirstAPI.models.Category;
import com.example.FirstAPI.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class FakeProductServiceImpl implements ProductService{


    private RestTemplate restTemplate;

    @Autowired
    public FakeProductServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    private Product convertDtoToProduct(FakeProductServiceDto dto){
        Product product = new Product();
        product.setId(dto.getId());
        product.setTitle(dto.getTitle());
        product.setPrice(dto.getPrice());
        product.setImage(dto.getImage());
        product.setDescription(dto.getDescription());
        Category category = new Category();
        category.setName(dto.getCategory());
        product.setCategory(category);
        return product;
    }
    @Override
    public Product getProductById   (long id) {
        RestTemplate restTemplate = new RestTemplate();
        FakeProductServiceDto fakedto = this.restTemplate.getForObject("https://fakestoreapi.com/products/" + id, FakeProductServiceDto.class);
        return convertDtoToProduct(fakedto);
    }

    @Override
    public List<Product> getAllProduct() {
        return null;
    }
}
