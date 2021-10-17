package com.thangdao.shop.security.service;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.thangdao.shop.dto.UserDetailsDto;
import com.thangdao.shop.entity.User;
import com.thangdao.shop.repository.UserRepository;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
	private UserRepository repository;
	
	@Autowired
	public UserDetailsServiceImpl(UserRepository userRepository) {
		repository = userRepository;
	}
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<User> user = repository.findByUsernameWithRole(username);
		
		if(!user.isPresent())
			throw new UsernameNotFoundException("Username is not existed.");
		
		Set<GrantedAuthority> authorities =new HashSet<>();
		authorities.add(new SimpleGrantedAuthority(user.get().getRole().getName()));
		
		return new UserDetailsDto(username, user.get().getPassword(), authorities);
	}

//	private Set<GrantedAuthority> getAuthorities(Set<Group> groups) {
//		Set<GrantedAuthority> authorities = 
//		
//		for(Group group : groups) {
//			authorities.add(new SimpleGrantedAuthority(group.getName()));
//		}
//		
//		return authorities;
//	}

}
