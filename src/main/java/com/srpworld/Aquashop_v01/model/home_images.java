package com.srpworld.Aquashop_v01.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Component
@Entity
public class home_images {
	@Id
	private int id;
	private String file_path;
	private String uploaded_at;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFile_path() {
		return file_path;
	}
	public void setFile_path(String file_path) {
		this.file_path = file_path;
	}
	public String getUploaded_at() {
		return uploaded_at;
	}
	public void setUploaded_at(String uploaded_at) {
		this.uploaded_at = uploaded_at;
	}
	@Override
	public String toString() {
		return "home_images [id=" + id + ", file_path=" + file_path + ", uploaded_at=" + uploaded_at + "]";
	}
	
	

	
}
