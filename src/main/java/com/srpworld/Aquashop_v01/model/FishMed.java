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

import jakarta.persistence.Entity;

@Entity
public class FishMed {

	  @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int medId;

	    @Column(name = "name", nullable = false)
	    private String name;

	    @Column(name = "category", nullable = false)
	    private String category;

	    @Column(name = "active_ingredients", nullable = false)
	    private String activeIngredients;

	    @Column(name = "description", nullable = false)
	    private String description;

	    @Column(name = "dosage_instruction", nullable = false)
	    private String dosageInstruction;

	    @Column(name = "precautions", nullable = false)
	    private String precautions;

	    @Column(name = "manufacturer", nullable = false)
	    private String manufacturer;

	    public Timestamp getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(Timestamp timestamp) {
			this.timestamp = timestamp;
		}

		public int getAvailableQuantity() {
			return availableQuantity;
		}

		public void setAvailableQuantity(int availableQuantity) {
			this.availableQuantity = availableQuantity;
		}

		@Column(name = "exp_date", nullable = false)
	    @Temporal(TemporalType.DATE)
	    private Date expDate;

	    @Column(name = "img_url")
	    private String imgUrl;
	    
	    @Column(name = "timestamp", nullable = false)
	    private Timestamp timestamp;

	    @OneToMany(mappedBy = "fishMed", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Relationship> relationships;

	    @Column(name = "price", nullable = false)
	    private int price;
	    

	    @Column(name = "available_quantity", nullable = false)
	    private int availableQuantity;

	    // Getters and Setters

	    public int getMedId() {
	        return medId;
	    }

	    public void setMedId(int medId) {
	        this.medId = medId;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public void setCategory(String category) {
	        this.category = category;
	    }

	    public String getActiveIngredients() {
	        return activeIngredients;
	    }

	    public void setActiveIngredients(String activeIngredients) {
	        this.activeIngredients = activeIngredients;
	    }

	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        this.description = description;
	    }

	    public String getDosageInstruction() {
	        return dosageInstruction;
	    }

	    public void setDosageInstruction(String dosageInstruction) {
	        this.dosageInstruction = dosageInstruction;
	    }

	    public String getPrecautions() {
	        return precautions;
	    }

	    public void setPrecautions(String precautions) {
	        this.precautions = precautions;
	    }

	    public String getManufacturer() {
	        return manufacturer;
	    }

	    public void setManufacturer(String manufacturer) {
	        this.manufacturer = manufacturer;
	    }

	    public Date getExpDate() {
	        return expDate;
	    }

	    public void setExpDate(Date expDate) {
	        this.expDate = expDate;
	    }

	    public String getImgUrl() {
	        return imgUrl;
	    }

	    public void setImgUrl(String imgUrl) {
	        this.imgUrl = imgUrl;
	    }

	    public List<Relationship> getRelationships() {
	        return relationships;
	    }

	    public void setRelationships(List<Relationship> relationships) {
	        this.relationships = relationships;
	    }

	    public int getPrice() {
	        return price;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }
}
