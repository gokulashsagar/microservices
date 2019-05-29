package com.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.dao.ProductDao;
import com.product.entity.ProductEntity;

@Service("pservice")
public class ProductService {
	
	@Autowired
	private ProductDao productDao;

	public List getAllproducts() {
		// TODO Auto-generated method stub
	 return	productDao.getAllProducts();
	}
	
	public void addproducts(ProductEntity product) {
		productDao.save(product);
	}

}
