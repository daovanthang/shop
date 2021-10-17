package com.thangdao.shop.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;


public class CreateUserDto {
	@NotBlank(message = "{user.username.not-blank}")
	private String username;
	
	@NotBlank(message = "{user.password.not-blank}")
	private String password;
	
	@NotBlank(message = "{user.email.not-blank}")
	@Email(message = "{user.email.valid}")
	private String email;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
