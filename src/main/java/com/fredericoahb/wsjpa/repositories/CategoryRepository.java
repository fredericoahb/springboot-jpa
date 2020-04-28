package com.fredericoahb.wsjpa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fredericoahb.wsjpa.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}