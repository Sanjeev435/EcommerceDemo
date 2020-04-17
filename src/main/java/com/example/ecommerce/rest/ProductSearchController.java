package com.example.ecommerce.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.ecommerce.dto.PayLoad;
import com.example.ecommerce.entity.Product;
import com.example.ecommerce.service.AggregationService;
import com.example.ecommerce.service.ProductService;

@RestController
public class ProductSearchController {
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private AggregationService aggregationService;

	
	@GetMapping("/search/{productName}")
	public List<Product> searchProduct(@RequestParam("productName") String productName) {
		return productService.getProductByName(productName);
	}
	
	@GetMapping("/search/{column}")
	public List<PayLoad> getGrouping(@RequestParam("column") String column) {
		return aggregationService.getAggregattedData(column);
	}
	
}
