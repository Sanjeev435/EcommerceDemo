package com.example.ecommerce.repository;

import java.util.List;

import com.example.ecommerce.dto.PayLoad;

public interface AgreegationRepository {

	List<PayLoad> getDetailsWithGroupBy(String columnName);

}
