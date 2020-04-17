package com.example.ecommerce.repository;

import org.springframework.stereotype.Repository;

import com.example.ecommerce.entity.Brand;

@Repository
public interface BrandRepository extends IEntityRepository<Brand, Integer> {

}
