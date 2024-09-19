package com.srpworld.Aquashop_v01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srpworld.Aquashop_v01.model.Fish;

@Repository
public interface FishProductRepo extends JpaRepository<Fish, Integer> {
	

}
