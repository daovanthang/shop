package com.thangdao.shop.service;

import java.util.List;

import com.thangdao.shop.dto.CreateProductDto;
import com.thangdao.shop.dto.ProductDto;
import com.thangdao.shop.entity.Product;

public interface ProductService {

	List<ProductDto> findAllDto();

	Product createProduct(CreateProductDto dto);

	Product findUserById(Long id);
}
