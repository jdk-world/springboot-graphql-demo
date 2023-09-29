package com.demo.spring.graphql.mutation;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.demo.spring.graphql.entity.Product;
import com.demo.spring.graphql.entity.Seller;
import com.demo.spring.graphql.service.ProductService;
import com.demo.spring.graphql.service.SellerService;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@RequiredArgsConstructor
public class ProductMutation implements GraphQLMutationResolver {
    private final ProductService productService;
    private final SellerService sellerService;

    public Product newProduct(Product product) {
        Seller seller = sellerService.findAll().get(0);
        product.setSeller(seller);
        return productService.create(product);
    }

    public Product updateProduct(Product product) {
        return productService.update(product);
    }

    public Product removeProduct(String id) {
        return productService.remove(id);
    }
}
