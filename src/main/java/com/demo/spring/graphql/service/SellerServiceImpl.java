package com.demo.spring.graphql.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import com.demo.spring.graphql.entity.Seller;
import com.demo.spring.graphql.repository.SellerRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SellerServiceImpl implements SellerService{
    private final SellerRepository sellerRepository;

    @Override
    public Seller createSeller(Seller seller) {
        return sellerRepository.save(seller);
    }

    @Override
    public List<Seller> findAll() {
        return sellerRepository.findAll();
    }
}
