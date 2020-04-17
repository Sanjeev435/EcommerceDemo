package com.example.ecommerce.repository;

import org.springframework.stereotype.Repository;

import com.example.ecommerce.entity.Product;
import com.example.ecommerce.entity.Seller;

@Repository
public interface SellerRepository extends IEntityRepository<Seller, Integer> {

}
