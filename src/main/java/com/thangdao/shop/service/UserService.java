package com.thangdao.shop.service;

import java.util.List;

import com.thangdao.shop.dto.CreateUserDto;
import com.thangdao.shop.dto.EditUserDto;
import com.thangdao.shop.dto.UserDto;
import com.thangdao.shop.entity.User;


public interface UserService {

	List<UserDto> findAllDto();

	boolean isTakenUsername(String username);

	boolean isTakenEmail(String email);

	User createUser(CreateUserDto dto);
	
	User editUser(EditUserDto editUserDto, Long id);
	
	User findUserById(Long id);
}
