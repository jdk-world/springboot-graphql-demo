package com.demo.spring.graphql.service;

import java.util.List;
import java.util.UUID;

import com.demo.spring.graphql.entity.Product;

public interface ProductService {
    Product getById(String id);
    List<Product> getAll();
    Product create(Product product);
    Product update(Product product);
    Product remove(String id);
}
