package com.product.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.product.entity.ProductEntity;
import com.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService pservice;
	
	@RequestMapping("/")
    public String welcome() {
    	return "Product microservice" ;
    }
	
	@RequestMapping("/all")
	public List getAllproducts() {
		return pservice.getAllproducts();
	}
	@RequestMapping(value="/add" ,method=RequestMethod.POST)
	public void addproducts(@RequestBody ProductEntity product) {    
		 pservice.addproducts(product);  
	}
}
