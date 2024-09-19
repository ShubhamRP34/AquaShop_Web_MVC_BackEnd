package com.srpworld.Aquashop_v01.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

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
public class AquaPlants {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int plantsid;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

    @Column(name = "light_requirements", nullable = false)
    private LightRequirements lightRequirements;

    @Column(name = "growth_rate", nullable = false)
    private GrowthRate growthRate;

    @Column(name = "size")
    private String size;

    @Column(name = "temperature_range")
    private String temperatureRange;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "stock", columnDefinition = "INT DEFAULT 0")
    private int stock = 0;

    @Column(name = "image_url")
    private String imageUrl;

    @Column(name = "timestamp", nullable = false)
    private Timestamp timestamp;
    
    @OneToMany(mappedBy = "aquaPlants", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Relationship> relationships;

    // Getters and Setters



    public String getName() {
        return name;
    }

    public int getPlantsid() {
		return plantsid;
	}

	public void setPlantsid(int plantsid) {
		this.plantsid = plantsid;
	}

	public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LightRequirements getLightRequirements() {
        return lightRequirements;
    }

    public void setLightRequirements(LightRequirements lightRequirements) {
        this.lightRequirements = lightRequirements;
    }

    public GrowthRate getGrowthRate() {
        return growthRate;
    }

    public void setGrowthRate(GrowthRate growthRate) {
        this.growthRate = growthRate;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getTemperatureRange() {
        return temperatureRange;
    }

    public void setTemperatureRange(String temperatureRange) {
        this.temperatureRange = temperatureRange;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public List<Relationship> getRelationships() {
		return relationships;
	}

	public void setRelationships(List<Relationship> relationships) {
		this.relationships = relationships;
	}

	public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    // Enums for lightRequirements and growthRate

    public enum LightRequirements {
        LOW, MEDIUM, HIGH
    }

    public enum GrowthRate {
        SLOW, MEDIUM, FAST
    }
}
