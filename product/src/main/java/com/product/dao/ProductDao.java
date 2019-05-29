package com.product.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.product.entity.ProductEntity;
import com.product.repository.ProductRepository;

@Repository
public class ProductDao {
	
	@Autowired
	private ProductRepository rep;
	
	public List getAllProducts() {
		return rep.findAll();
	}
	
	public void save(ProductEntity product) {
		rep.save(product);
	}

}
