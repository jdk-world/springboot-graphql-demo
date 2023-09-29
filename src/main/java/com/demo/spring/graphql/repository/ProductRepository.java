package com.demo.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.spring.graphql.entity.Product;

import java.util.UUID;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {
}
