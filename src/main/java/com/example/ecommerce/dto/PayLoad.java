package com.example.ecommerce.dto;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Builder
@Getter
@Setter
public class PayLoad {
	
	
	private String brandName;
	private BigDecimal price;
	private String color;
	private String size;
	private String productName;
	

}
