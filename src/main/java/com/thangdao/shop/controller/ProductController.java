package com.thangdao.shop.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.thangdao.shop.dto.CreateProductDto;
import com.thangdao.shop.entity.Product;
import com.thangdao.shop.service.ProductService;
import com.thangdao.shop.upload.FileStorageService;

@Controller
public class ProductController {

	@Autowired
	private ProductService productService;

	@Autowired
	FileStorageService storageService;

	@PostMapping("admin/product/save")
	public void saveProduct(CreateProductDto createProductDto) {
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

	@GetMapping("admin/product/save")
	public String addProduct(Model model) {
		model.addAttribute("createProductDto", new CreateProductDto());
		return "admin/ecommerce/add-product";
	}

}
