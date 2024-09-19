package com.srpworld.Aquashop_v01.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.srpworld.Aquashop_v01.model.Fish;
import com.srpworld.Aquashop_v01.model.sliderimages;
import com.srpworld.Aquashop_v01.service.FishHomeService;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class FishHomeController {
	
	@Autowired
	FishHomeService serv;
	
	@GetMapping("/getFishSliderImg={id}")
	private sliderimages getFishSliderImg(@PathVariable int id)
	{
		return serv.getImgById(id);
	}
	
	@GetMapping("/getfishproducttemp={id}")
	private Fish getFishtemp(@PathVariable int id)
	{
//		return serv.getImgById(id);
		return serv.getfishtemplate(id);
		
	}

}
