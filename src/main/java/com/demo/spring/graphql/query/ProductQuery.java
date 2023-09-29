package com.demo.spring.graphql.query;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.demo.spring.graphql.entity.Product;
import com.demo.spring.graphql.service.ProductService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ProductQuery implements GraphQLQueryResolver {
    private final ProductService productService;

    public List<Product> products() {
        return productService.getAll();
    }

    public Product product(String id) {
        return productService.getById(id);
    }
}