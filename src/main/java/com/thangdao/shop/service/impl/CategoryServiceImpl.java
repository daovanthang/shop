package com.thangdao.shop.service.impl;

import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thangdao.shop.dto.CategoryDto;
import com.thangdao.shop.entity.Category;
import com.thangdao.shop.repository.CategoryRepository;
import com.thangdao.shop.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	private CategoryRepository CategoryRepository;

	@Autowired
	public CategoryServiceImpl(com.thangdao.shop.repository.CategoryRepository categoryRepository) {
		CategoryRepository = categoryRepository;
	}

	@Override
	public List<CategoryDto> findAllDto() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Category createCategory(CategoryDto dto) {
		if (dto == null) {
			return null;
		}
		Category category = new Category();
		category.setName(dto.getName());
		category.setSortOrder(dto.getSortOrder());
		category.setDescription(dto.getDescription());
		category.setImageUrl(dto.getImageUrl());
		if (dto.getParentId() != null) {
			Optional<Category> opCategory = CategoryRepository.findById(dto.getParentId());
			if (opCategory.isEmpty()) {
			}
		}
		return null;
	}

	@Override
	public Category findCategoryById(Long id) {
		if (id == null) {
			return null;
		}
		Optional<Category> opCategory = CategoryRepository.findById(id);
		if(opCategory.isEmpty()) {
			return null;
		}
		return opCategory.get();
	}

	@Override
	public List<Category> findAll() {
		// TODO Auto-generated method stub
		return CategoryRepository.findAll();
	}

	@Override
	public Boolean deleteCategory(Long id) {
		if (id == null) {
			return null;
		}
		Optional<Category> opCategory = CategoryRepository.findById(id);
		if(opCategory.isEmpty()) {
			return null;
		}
		CategoryRepository.delete(opCategory.get());
		
		return true;
	}

	@Override
	public CategoryDto updateCategory(CategoryDto dto) {
		if (dto == null) {
			return null;
		}
		Optional<Category> opCategory = CategoryRepository.findById(dto.getId());
		
		if(opCategory.isEmpty()) {
			return null;
		}
		
		//check parent category
		if(dto.getParentId() != null && opCategory.get().getParent().getId() != dto.getParentId()) {
			Optional<Category> opParenCategory = CategoryRepository.findById(dto.getParentId());
			if(opParenCategory.isEmpty()) {
				return null;
			}
			//set parent category
			opCategory.get().setParent(opParenCategory.get());
		}
		
		if(dto.getImageUrl() != null && StringUtils.isNotBlank(dto.getImageUrl())) {
			opCategory.get().setImageUrl(dto.getImageUrl());
		}
		
		if(dto.getStatus() != null) {
			opCategory.get().setStatus(dto.getStatus());
		}
		
		opCategory.get().setName(dto.getName());
		opCategory.get().setDescription(dto.getDescription());
		opCategory.get().setSortOrder(dto.getSortOrder());
		opCategory.get().setVersion(opCategory.get().getVersion() + 1);
		
		Category category = CategoryRepository.save(opCategory.get());
		
		CategoryDto newDto = new CategoryDto();
		
		newDto.setDescription(category.getDescription());
		newDto.setId(category.getId());
		newDto.setImageUrl(category.getImageUrl());
		newDto.setName(category.getName());
		newDto.setParentId(category.getParent().getId());
		newDto.setSortOrder(category.getSortOrder());
		newDto.setStatus(category.getStatus());
		
		return newDto;
		
	}
	
	
	

}
