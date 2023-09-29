package com.demo.spring.graphql.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Seller extends BaseEntity{
    private String name;
    private String address;
}
