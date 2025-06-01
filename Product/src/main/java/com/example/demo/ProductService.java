package com.example.demo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	private ProductRepository repo;
	
	//Retrieve all
	 public List<Product> listAll()  
	    { 
	       return repo.findAll();
	    } 
	     

}
