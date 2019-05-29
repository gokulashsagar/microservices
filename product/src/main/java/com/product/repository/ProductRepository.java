package com.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.product.entity.ProductEntity;

public interface ProductRepository extends JpaRepository<ProductEntity, Long >{

}
