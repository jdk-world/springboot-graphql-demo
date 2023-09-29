package com.demo.spring.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.demo.spring.graphql.entity.Seller;
import com.demo.spring.graphql.service.SellerService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class SellerMutation implements GraphQLMutationResolver {
    private final SellerService sellerService;

    public Seller newSeller(Seller seller) {
        return sellerService.createSeller(seller);
    }
}
