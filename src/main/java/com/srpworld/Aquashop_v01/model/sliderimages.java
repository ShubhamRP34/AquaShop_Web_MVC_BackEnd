package com.srpworld.Aquashop_v01.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class sliderimages {

	@Id
	private int id;
	private String about;
	private String imgurl;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAbout() {
		return about;
	}
	public void setAbout(String about) {
		this.about = about;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	@Override
	public String toString() {
		return "sliderimages [id=" + id + ", about=" + about + ", imgurl=" + imgurl + "]";
	}
	
	
}
