package com.thangdao.shop.service;

import java.util.List;

import com.thangdao.shop.dto.CategoryDto;
import com.thangdao.shop.entity.Category;

public interface CategoryService {

	List<CategoryDto> findAllDto();

	Category createCategory(CategoryDto dto);

	Category findCategoryById(Long id);
	
	List<Category> findAll();
	
	Boolean deleteCategory(Long id);
	
	CategoryDto updateCategory(CategoryDto dto);
}
