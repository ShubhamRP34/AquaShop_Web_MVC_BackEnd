package com.srpworld.Aquashop_v01.model;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Component
@Entity
public class Fish {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int fish_id;

    @Column(name = "f_name", nullable = false)
    private String fName;

    @Column(name = "species", nullable = false)
    private String species;

    @Column(name = "family", nullable = false)
    private String family;

    @Column(name = "s_size", nullable = false)
    private boolean smallSize;

    @Column(name = "m_size", nullable = false)
    private boolean mediumSize;

    @Column(name = "l_size", nullable = false)
    private boolean largeSize;

    @Column(name = "behaviour")
    private String behaviour;

    @Column(name = "water_parameter")
    private String waterParameter;

    @Column(name = "habitat")
    private String habitat;

    @Column(name = "diet")
    private String diet;

    @Column(name = "breeding_type")
    private String breedingType;

    @Column(name = "origin")
    private String origin;

    @Column(name = "tankmates")
    private String tankmates;

    @Column(name = "price", nullable = false)
    private int price;

    @Column(name = "avail_quantity", nullable = false)
    private int availableQuantity;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
//    @JoinColumn(name = "fish_id")
//    private List<Relation> relations;
    
    @OneToMany(mappedBy = "fish", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Relationship> relationships;

    @Column(name = "timestamp")
    private Timestamp timestamp;

    @Column(name = "img_url")
    private String imgUrl;

    // Getters and Setters

    

    public String getFName() {
        return fName;
    }

    public int getFish_id() {
		return fish_id;
	}

	public void setFish_id(int fish_id) {
		this.fish_id = fish_id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public List<Relationship> getRelationships() {
		return relationships;
	}

	public void setRelationships(List<Relationship> relationships) {
		this.relationships = relationships;
	}

	public void setFName(String fName) {
        this.fName = fName;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public boolean isSmallSize() {
        return smallSize;
    }

    public void setSmallSize(boolean smallSize) {
        this.smallSize = smallSize;
    }

    public boolean isMediumSize() {
        return mediumSize;
    }

    public void setMediumSize(boolean mediumSize) {
        this.mediumSize = mediumSize;
    }

    public boolean isLargeSize() {
        return largeSize;
    }

    public void setLargeSize(boolean largeSize) {
        this.largeSize = largeSize;
    }

    public String getBehaviour() {
        return behaviour;
    }

    public void setBehaviour(String behaviour) {
        this.behaviour = behaviour;
    }

    public String getWaterParameter() {
        return waterParameter;
    }

    public void setWaterParameter(String waterParameter) {
        this.waterParameter = waterParameter;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getBreedingType() {
        return breedingType;
    }

    public void setBreedingType(String breedingType) {
        this.breedingType = breedingType;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getTankmates() {
        return tankmates;
    }

    public void setTankmates(String tankmates) {
        this.tankmates = tankmates;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

//    public List<Relation> getRelations() {
//        return relations;
//    }
//
//    public void setRelations(List<Relation> relations) {
//        this.relations = relations;
//    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

}
