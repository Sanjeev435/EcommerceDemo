package com.example.ecommerce.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.ecommerce.dto.PayLoad;

@Repository
public class AgreegationRepositoryImpl implements AgreegationRepository {

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Override
	public List<PayLoad> getDetailsWithGroupBy(String columnName) {
		
		// will generate the query based on column : factory for query QueryGenrator.class
		// Need to create one more factor for rowMapper
		
		String sqlQuery = "SELECT * FROM PRODUCT GROUP BY BRAND_ID ";

		return namedParameterJdbcTemplate.query(sqlQuery, rowMapper);
	}

	private RowMapper<PayLoad> rowMapper = (rs, rownum) -> {
		return PayLoad.builder().productName(rs.getString("PRODUCT_NAME"))
				.brandName(rs.getString("BRAND_NAME"))
						.color(rs.getString("COLOR"))
								.size(rs.getString("SIZE")).build();
	};
}
