package com.thangdao.shop.dto;

import org.springframework.web.multipart.MultipartFile;

import com.thangdao.shop.entity.Category;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {
	private String name;
	private int price;
	private int quanty;
	private String description;
	private String imageUrl;
	private Category category;
	private String sku;
	private int weight;
	private String vendor;
	private MultipartFile file;

}
