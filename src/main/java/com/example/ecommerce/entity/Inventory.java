package com.example.ecommerce.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name="INVENTORY")
@AllArgsConstructor
@NoArgsConstructor
public class Inventory {
	
	@Column(name="INVENTORY_ID", precision = 10)
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer inventoryId;
	
	@Column(name="QUANTITY_AVAILABLE", precision = 10)
	private Integer quantityAvailable;
	
	@ManyToOne(targetEntity = Product.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "PRODUCT_ID", nullable = false, referencedColumnName = "PRODUCT_ID", table = "PRODUCT")
	private Product product;
	
	@ManyToOne(targetEntity = Seller.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "SELLER_ID", nullable = false, referencedColumnName = "SELLER_ID", table = "SELLER")
	private Seller seller;

}
