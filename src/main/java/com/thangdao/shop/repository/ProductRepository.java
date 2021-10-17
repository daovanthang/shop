package com.thangdao.shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.thangdao.shop.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

}
