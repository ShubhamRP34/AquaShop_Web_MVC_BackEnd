package com.srpworld.Aquashop_v01.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srpworld.Aquashop_v01.model.home_images;
import com.srpworld.Aquashop_v01.repository.home_img_repo;

@Service
public class HomeService {
	
	@Autowired
	home_images hi;

	@Autowired
	home_img_repo i_repo;
	
	public home_images gotImageById(int id)
	{
		try
		{
			Optional<home_images> imgs = i_repo.findById(id);
		    hi = imgs.get();
//			String path = hi.getFile_path(); 
			return hi;
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		return null;
	}
}
