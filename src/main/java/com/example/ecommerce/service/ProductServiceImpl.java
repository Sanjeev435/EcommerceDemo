package com.example.ecommerce.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.entity.Product;
import com.example.ecommerce.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	
	@Override
	public List<Product> getProductByName(String productName) {
		return productRepository.findAll().stream().filter(p -> productName.equalsIgnoreCase(p.getProductName()))
				.collect(Collectors.toList());
	}

}
