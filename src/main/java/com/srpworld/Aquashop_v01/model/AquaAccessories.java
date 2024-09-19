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
public class AquaAccessories {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accesid;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "brand", nullable = false)
    private String brand;

    @Column(name = "material", nullable = false)
    private String material;

    @Column(name = "size", nullable = false)
    private String size;

    @Column(name = "price", nullable = false)
    private int price;

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

	@Column(name = "additional_info")
    private String additionalInfo;

    @Column(name = "weight", nullable = false)
    private String weight;

    @Column(name = "color", nullable = false)
    private String color;

    @Column(name = "image_url")
    private String imageUrl;
    
    @Column(name = "timestamp", nullable = false)
    private Timestamp timestamp;

    @OneToMany(mappedBy = "aquaAccessories", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Relationship> relationships;

    @Column(name = "description", nullable = false)
    private String description;
    

    @Column(name = "available_quantity", nullable = false)
    private int availableQuantity;

    // Getters and Setters

 

    public String getName() {
        return name;
    }

    public int getAccesid() {
		return accesid;
	}

	public void setAccesid(int accesid) {
		this.accesid = accesid;
	}

	public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<Relationship> getRelationships() {
        return relationships;
    }

    public void setRelationships(List<Relationship> relationships) {
        this.relationships = relationships;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
