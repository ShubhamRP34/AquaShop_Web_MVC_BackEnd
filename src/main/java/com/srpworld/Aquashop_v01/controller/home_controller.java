package com.srpworld.Aquashop_v01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.srpworld.Aquashop_v01.model.home_images;
import com.srpworld.Aquashop_v01.service.HomeService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class home_controller {
	
	@Autowired
	HomeService home_service;
	
	@GetMapping("/getimage={id}")
	public home_images gethomeImg(@PathVariable int id)
	{
	
	
		return home_service.gotImageById(id);
	
	}

}
