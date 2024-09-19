package com.srpworld.Aquashop_v01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srpworld.Aquashop_v01.model.Fish;
import com.srpworld.Aquashop_v01.repository.FishProductRepo;

@Service
public class ProductService {
	
	@Autowired
	FishProductRepo f_repo;

	public void addfish(Fish fish) {
		// TODO Auto-generated method stub
		
		try {
			f_repo.save(fish);
			
		} catch (Exception e) {
			System.out.println(e);
			// TODO: handle exception
		}
		
		
	}

	
}
