package com.example.ecommerce.specifications;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.Root;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.*;

import org.springframework.data.jpa.domain.Specification;

import com.example.ecommerce.entity.Product;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public class AggregationSpecifications {
	
	
	public static Specification<Product> groupByAssignedColumns(String columnName){
		
		return (Root<Product> root, CriteriaQuery<?> query, CriteriaBuilder cb) -> {
			cb.createQuery(Product.class);
			
			List<Predicate> predicate  = new ArrayList<>();
			// Add grouping predicte
			//predicate.add(cb.);
			return cb.and(predicate.toArray(new Predicate[predicate.size()]));
		};
		
	}
	

}
