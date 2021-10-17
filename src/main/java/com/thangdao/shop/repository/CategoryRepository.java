package com.thangdao.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thangdao.shop.entity.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long>{

}
