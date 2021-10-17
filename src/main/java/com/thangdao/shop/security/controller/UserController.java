package com.thangdao.shop.security.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.thangdao.shop.entity.User;
import com.thangdao.shop.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	
	private UserService userService;
	
	@Autowired
	public UserController(UserService userService) {
		this.userService = userService;
	}


	@GetMapping("edit/{id}")
	public String editUser(@PathVariable Long id, Model model) {
		User user = userService.findUserById(id);
		if(user == null) {
			return "user/home";
		}
		model.addAttribute("user", user);
		return "user/edit";
	}

}
