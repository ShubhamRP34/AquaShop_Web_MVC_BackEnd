package com.srpworld.Aquashop_v01.model;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class FishFood {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int fishfoodid;

	    @Column(name = "food_name", nullable = false)
	    private String foodName;

	    @Column(name = "brand", nullable = false)
	    private String brand;

	    @Column(name = "type_of_food", nullable = false)
	    private String typeOfFood;

	    @Column(name = "nutritional_detail", nullable = false)
	    private String nutritionalDetail;

	    @Column(name = "package_size", nullable = false)
	    private String packageSize;

	    @Column(name = "price", nullable = false)
	    private int price;

	    @Column(name = "fish_category", nullable = false)
	    private String fishCategory;

	    @Column(name = "dietary_requirement", nullable = false)
	    private String dietaryRequirement;

	    @Column(name = "img_url")
	    private String imgUrl;

	    @Column(name = "manufacturing_date", nullable = false)
	    @Temporal(TemporalType.DATE)
	    private Date manufacturingDate;

	    @Column(name = "exp_date", nullable = false)
	    @Temporal(TemporalType.DATE)
	    private Date expDate;

	    @OneToMany(mappedBy = "fishFood", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Relationship> relationships;

	    @Column(name = "available_quantity", nullable = false)
	    private int availableQuantity;

	    @Column(name = "timestamp", nullable = false)
	    private Timestamp timestamp;

	    // Getters and Setters


	    public String getFoodName() {
	        return foodName;
	    }

	    public int getFishfoodid() {
			return fishfoodid;
		}

		public void setFishfoodid(int fishfoodid) {
			this.fishfoodid = fishfoodid;
		}

		public void setFoodName(String foodName) {
	        this.foodName = foodName;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public String getTypeOfFood() {
	        return typeOfFood;
	    }

	    public void setTypeOfFood(String typeOfFood) {
	        this.typeOfFood = typeOfFood;
	    }

	    public String getNutritionalDetail() {
	        return nutritionalDetail;
	    }

	    public void setNutritionalDetail(String nutritionalDetail) {
	        this.nutritionalDetail = nutritionalDetail;
	    }

	    public String getPackageSize() {
	        return packageSize;
	    }

	    public void setPackageSize(String packageSize) {
	        this.packageSize = packageSize;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }

	    public String getFishCategory() {
	        return fishCategory;
	    }

	    public void setFishCategory(String fishCategory) {
	        this.fishCategory = fishCategory;
	    }

	    public String getDietaryRequirement() {
	        return dietaryRequirement;
	    }

	    public void setDietaryRequirement(String dietaryRequirement) {
	        this.dietaryRequirement = dietaryRequirement;
	    }

	    public String getImgUrl() {
	        return imgUrl;
	    }

	    public void setImgUrl(String imgUrl) {
	        this.imgUrl = imgUrl;
	    }

	    public Date getManufacturingDate() {
	        return manufacturingDate;
	    }

	    public void setManufacturingDate(Date manufacturingDate) {
	        this.manufacturingDate = manufacturingDate;
	    }

	    public Date getExpDate() {
	        return expDate;
	    }

	    public void setExpDate(Date expDate) {
	        this.expDate = expDate;
	    }

	    public List<Relationship> getRelationships() {
	        return relationships;
	    }

	    public void setRelationships(List<Relationship> relationships) {
	        this.relationships = relationships;
	    }

	    public int getAvailableQuantity() {
	        return availableQuantity;
	    }

	    public void setAvailableQuantity(int availableQuantity) {
	        this.availableQuantity = availableQuantity;
	    }

	    public Timestamp getTimestamp() {
	        return timestamp;
	    }

	    public void setTimestamp(Timestamp timestamp) {
	        this.timestamp = timestamp;
	    }

}
