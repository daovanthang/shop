package com.thangdao.shop.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class EditUserDto {
	
	private String password;
	
	private String email;
	
	private String fullname;
	
	private String displayName;
	
	private String avatar;
	
}
