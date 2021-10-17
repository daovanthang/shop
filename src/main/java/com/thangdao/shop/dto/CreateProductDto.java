package com.thangdao.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductDto {
	private String name;
	private int price;
	private int quanty;
	private String description;
	private String imageUrl;
	private Long categoryId;
	private String sku;
	private int weight;
	private String vendor;
	private boolean status;
}
