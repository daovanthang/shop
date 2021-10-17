package com.thangdao.shop.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


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
@Table(name = "category")
public class Category extends BaseEntity{
	
	private String name;
	
	private int sortOrder;
	
	private String description;
	
	@Column(nullable = true)
	private String imageUrl;
	
	@Column(columnDefinition="BOOLEAN DEFAULT true")
	private Boolean status;
	
	@ManyToOne
    @JoinColumn(name="parent_id", nullable=true)
	private Category parent;
	
	@OneToMany(mappedBy="parent", fetch = FetchType.LAZY)
	private List<Category> categorys;
	
	@OneToMany(mappedBy="category")
	private List<Product> products;

}
