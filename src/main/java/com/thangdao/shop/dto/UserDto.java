package com.thangdao.shop.dto;

import java.util.Set;

import com.thangdao.shop.common.util.UserStatus;
import com.thangdao.shop.entity.Role;


public interface UserDto {
	// Spring Projection
	public String getUsername();
	
	public String getEmail();

	public String getFullname();

	public String getDisplayName();

	public String getAvatar();

	public UserStatus getStatus();

	public String getFacebook();

	public String getJob();

	public String getDepartment();

	public String getHobby();

	public Set<Role> getGroups();
}
