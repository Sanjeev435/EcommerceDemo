package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.entity.Product;

public interface ProductService {
	
	List<Product> getProductByName(String productName);

}
