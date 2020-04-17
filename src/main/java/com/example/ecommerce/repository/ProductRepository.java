package com.example.ecommerce.repository;

import org.springframework.stereotype.Repository;

import com.example.ecommerce.entity.Product;

@Repository
public interface ProductRepository extends IEntityRepository<Product, Integer> {

}
