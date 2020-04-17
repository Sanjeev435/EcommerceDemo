package com.example.ecommerce.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="SELLER")
@AllArgsConstructor
@NoArgsConstructor
public class Seller {
	
	@Column(name="SELLER_ID", precision = 10)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer sellerId;
	
	@Column(name="SELLER_NAME", length = 100)
	private String SELLER_NAME;

}
