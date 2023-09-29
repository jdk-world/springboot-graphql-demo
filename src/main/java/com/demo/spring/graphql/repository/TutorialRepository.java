package com.demo.spring.graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.spring.graphql.model.Tutorial;

public interface TutorialRepository extends JpaRepository<Tutorial, Long> {

}
