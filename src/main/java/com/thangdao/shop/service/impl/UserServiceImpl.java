package com.thangdao.shop.service.impl;

import java.util.List;
import java.util.Optional;

import org.apache.commons.lang3.StringUtils;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.thangdao.shop.common.util.UserStatus;
import com.thangdao.shop.dto.CreateUserDto;
import com.thangdao.shop.dto.EditUserDto;
import com.thangdao.shop.dto.UserDto;
import com.thangdao.shop.entity.User;
import com.thangdao.shop.repository.UserRepository;
import com.thangdao.shop.service.UserService;

@Service
public class UserServiceImpl implements UserService {
	private UserRepository repository;
	private PasswordEncoder encoder;

	public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
		repository = userRepository;
		encoder = passwordEncoder;
	}

	@Override
	public List<UserDto> findAllDto() {
		return repository.findAllUserDto();
	}

	@Override
	public boolean isTakenUsername(String username) {
		return repository.countByUsername(username.toLowerCase()) >= 1;
	}

	@Override
	public boolean isTakenEmail(String email) {
		return repository.countByEmail(email) >= 1;
	}

	@Override
	public User createUser(CreateUserDto dto) {
		User newUser = new User();

		newUser.setUsername(dto.getUsername());
		newUser.setEmail(dto.getEmail());
		newUser.setPassword(encoder.encode(dto.getPassword())); // encode password trước khi set
		newUser.setStatus(UserStatus.ACTIVE);

		return repository.save(newUser);
	}

	@Override
	public User editUser(EditUserDto editUserDto, Long id) {
		Optional<User> user = repository.findById(id);
		if (user.isEmpty()) {
			return null;
		}
		if (StringUtils.isNotBlank(editUserDto.getPassword())) {
			user.get().setPassword(editUserDto.getPassword());
		}
		if (StringUtils.isNotBlank(editUserDto.getFullname())) {
			user.get().setPassword(editUserDto.getFullname());
		}
		if (StringUtils.isNotBlank(editUserDto.getAvatar())) {
			user.get().setPassword(editUserDto.getAvatar());
		}
		if (StringUtils.isNotBlank(editUserDto.getDisplayName())) {
			user.get().setPassword(editUserDto.getDisplayName());
		}
		if (StringUtils.isNotBlank(editUserDto.getEmail())) {
			user.get().setPassword(editUserDto.getEmail());
		}

		return repository.save(user.get());
	}

	@Override
	public User findUserById(Long id) {
		 Optional<User> user = repository.findById(id);
		 if(user.isEmpty()) {
			 return null;
		 }
		return user.get();
	}

}
