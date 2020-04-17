package com.example.ecommerce.entity;

import java.math.BigDecimal;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@Entity
@Table(name="PRODUCT")
@AllArgsConstructor
@NoArgsConstructor
public class Product {
	
	@Column(name="PRODUCT_ID", precision = 10)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer productId;
	
	@ManyToOne(targetEntity = Brand.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "BRAND_ID", nullable = false, referencedColumnName = "BRAND_ID", table = "BRAND")
	private Brand brand;
	
	@Column(name="PRICE", precision = 10, scale = 2)
	private BigDecimal price;
	
	@Column(name="COLOR", length = 25)
	private String color;
	
	@Column(name="SIZE", length = 10)
	private String size;
	
	@Column(name="PRODUCT_NAME", length = 50)
	private String productName;


}
