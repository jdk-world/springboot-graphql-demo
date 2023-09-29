package com.demo.spring.graphql.service;

import java.util.List;

import com.demo.spring.graphql.entity.Seller;

public interface SellerService {
    Seller createSeller(Seller seller);
    List<Seller> findAll();
}
