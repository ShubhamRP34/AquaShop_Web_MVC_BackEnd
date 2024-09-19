package com.srpworld.Aquashop_v01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.srpworld.Aquashop_v01.model.Fish;
import com.srpworld.Aquashop_v01.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService f_service;
	
	@Autowired
	Fish f_product;
	
	@PostMapping("/AddProduct")
	public void savefish(@RequestBody Fish fish)
	{
		// Remember to handle images it only handle the object		
		
		f_service.addfish(fish);
	}

	
	

}
