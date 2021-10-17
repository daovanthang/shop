package com.thangdao.shop.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
	public class IndexController {

	    @GetMapping("/")
	    public String homePage() {
	        return "index";
	    }

	    @GetMapping("/shop")
	    public String contactPage() {
	        return "shop";
	    }

	    @GetMapping("/blog")
	    public String blog() {
	        return "blog";
	    }
	    @GetMapping("/article")
	    public String article() {
	        return "article";
	    }
	    @GetMapping("/signin")
	    public String signin() {
	        return "signin";
	    }
	    @GetMapping("/signup")
	    public String signup() {
	        return "signup";
	    }
	    @GetMapping("/admin/index")
	    public String adminIndex() {
	        return "admin/index";
	    }
	    @GetMapping("/admin/ecommerce/add-product")
	    public String addeCommerceProduct() {
	        return "admin/ecommerce/add-product";
	    }
	}
