package com.thangdao.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryDto {

	private Long id;
	private String name;
	private int sortOrder;
	private String description;
	private Long parentId;
	private Boolean status;
	private String imageUrl;
	
}
