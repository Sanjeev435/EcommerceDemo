package com.example.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ecommerce.dto.PayLoad;
import com.example.ecommerce.repository.AgreegationRepository;

@Service
public class AggregationServiceImpl implements AggregationService{

	/*
	 * 1. Group by brand / client 2. Group by price 3. Group by Color 4. Group by
	 * Size
	 */
	
	@Autowired
	private AgreegationRepository agreegationRepository;
	
	
	@Override
	public List<PayLoad> getAggregattedData(String column) {
		return agreegationRepository.getDetailsWithGroupBy(column);
	}
	
	

}
