package com.thangdao.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.thangdao.shop.dto.CreateUserDto;
import com.thangdao.shop.entity.User;
import com.thangdao.shop.service.UserService;

@Controller
public class DefaultController {

	private UserService userService;

	@Autowired
	public DefaultController(UserService userService) {
		this.userService = userService;
	}

	@GetMapping("/login")
	public String viewLoginPage() {
		return "login";
	}

	@GetMapping("/register")
	public String register(Model model) {
		model.addAttribute("userDto", new CreateUserDto());
		return "register";
	}

	@PostMapping("/process_register")
	public String processRegister(CreateUserDto userDto) {
		User createUser = userService.createUser(userDto);
		System.out.println(createUser.getEmail());
		return "register_success";

	}
}
