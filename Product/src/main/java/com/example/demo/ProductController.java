package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	//retrieve all
	@GetMapping("/getProduct")
	public List<Product> readAll()
	{
		return service.listAll();
	}

}
