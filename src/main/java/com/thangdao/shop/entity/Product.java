package com.thangdao.shop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "products")
public class Product extends BaseEntity {

	@NotNull
	private String name;

	@NotNull
	private int price;

	@NotNull
	private int quanty;

	@Column(columnDefinition = "TEXT")
	private String description;

	@NotNull
	private String imageUrl;

	@ManyToOne
    @JoinColumn(name="category_id", nullable=false)
	private Category category;

	@ManyToOne
	@JoinColumn(name = "cart_id", nullable = true)
	private Cart cart;
	
	@NotNull
	private int weight;
	
	@NotNull
	private String sku;
	
	@NotNull
	private String vendor;

}
