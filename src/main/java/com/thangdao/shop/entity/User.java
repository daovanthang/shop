package com.thangdao.shop.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.thangdao.shop.common.util.UserStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "user")
public class User extends BaseEntity {
	@NotNull
	@Column(unique = true)
	@Size(min = 3, max = 50)
	private String username;
	
	@NotNull
	private String password;
	
	@NotNull
	@Email
	@Column(unique = true)
	private String email;
	
	private String fullname;
	private String displayName;
	private String avatar;
	
	@NotNull
	@Enumerated(EnumType.STRING)
	private UserStatus status;
	
	private String facebook;
	
	@OneToMany(mappedBy="user")
	private List<Cart> carts;
	
	@OneToMany(mappedBy="user")
	private List<Invoice> invoices;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "role_id", referencedColumnName = "id")
	private Role role;
	
}
