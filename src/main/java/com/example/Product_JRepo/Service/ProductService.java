package com.example.Product_JRepo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Product_JRepo.Entity.Product;
import com.example.Product_JRepo.Repository.ProductRepository;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public Product save(Product product) {
        return repository.save(product);
    }

    public Optional<Product> findByName(String name) {
        return repository.findByName(name);
    }

}
