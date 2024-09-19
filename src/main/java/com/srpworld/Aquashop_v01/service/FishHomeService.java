package com.srpworld.Aquashop_v01.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srpworld.Aquashop_v01.model.Fish;
import com.srpworld.Aquashop_v01.model.sliderimages;
import com.srpworld.Aquashop_v01.repository.FishProductRepo;
import com.srpworld.Aquashop_v01.repository.ProductImgSlider;

@Service
public class FishHomeService {

	@Autowired
	ProductImgSlider repo;
	
	@Autowired
	FishProductRepo f_repo;
	
	@Autowired
	Fish f;
	
	@Autowired
	sliderimages slider;
	
	public sliderimages getImgById(int id)
	{
		Optional<sliderimages> s = repo.findById(id);
		
		slider = s.get();
		
		return slider;
		
	}
	
	
	public Fish getfishtemplate(int id)
	{
		Optional<Fish> ft = f_repo.findById(id);
		
		f = ft.get();
		
		return f;
	}
	
}
