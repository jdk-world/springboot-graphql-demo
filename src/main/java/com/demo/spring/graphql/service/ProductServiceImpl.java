package com.demo.spring.graphql.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import com.demo.spring.graphql.entity.Product;
import com.demo.spring.graphql.repository.ProductRepository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProductServiceImpl implements ProductService{
    private final ProductRepository productRepository;

    @Override
    public Product getById(String id) {
        Optional<Product> product = productRepository.findById(id);
        return product.orElse(null);
    }

    @Override
    public List<Product> getAll() {
        List<Product> allProducts =  productRepository.findAll();
        System.err.println("all");
        return allProducts;
    }

    @Override
    public Product create(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }

    @Override
    public Product remove(String id) {
        Optional<Product> removedProduct = productRepository.findById(id);
        if(removedProduct.isPresent()) {
            productRepository.deleteById(id);
        }
        return removedProduct.orElse(null);
    }
}
