package com.example.ecommerce.repository;

import org.springframework.stereotype.Repository;

import com.example.ecommerce.entity.Inventory;

@Repository
public interface InventoryRepository extends IEntityRepository<Inventory, Integer>  {

}
