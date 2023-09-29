package com.demo.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.spring.graphql.model.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}