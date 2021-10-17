package com.thangdao.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.thangdao.shop.dto.CategoryDto;
import com.thangdao.shop.dto.CreateProductDto;

@Controller
public class CategoryController {
	
	@PostMapping("admin/category/save")
	public void saveProduct(CategoryDto categoryDto) {
		String message = "";

		try {
//    	      List<String> pathUrl = new ArrayList<>();
//
//    	      Arrays.asList(files).stream().forEach(file -> {
//    	    	pathUrl.add(storageService.save(file));;
//    	      });

			message = "Uploaded the files successfully";

		} catch (Exception e) {
			message = "Fail to upload files!";
		}

	}

	@GetMapping("admin/category/save")
	public String addProduct(Model model) {
		model.addAttribute("categoryDto", new CategoryDto());
		return "admin/ecommerce/add-category";
	}

}
