package com.example.ecommerce.service;

import java.util.List;

import com.example.ecommerce.dto.PayLoad;

public interface AggregationService {
	
	List<PayLoad> getAggregattedData(String column);

}
