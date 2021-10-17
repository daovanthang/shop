package com.thangdao.shop.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.thangdao.shop.common.util.CartStatus;

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
@Table(name = "cart")
public class Cart extends BaseEntity {

	@Column(name = "product_quanty", nullable = false)
	private int productQuanty;

	@OneToMany(mappedBy = "cart")
	private List<Product> products;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	private CartStatus status;

	@OneToOne(mappedBy = "cart")
	private Invoice invoice;
}
