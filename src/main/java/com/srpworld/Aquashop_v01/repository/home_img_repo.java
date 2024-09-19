package com.srpworld.Aquashop_v01.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.srpworld.Aquashop_v01.model.home_images;

@Repository
public interface home_img_repo extends JpaRepository<home_images, Integer> {

}
