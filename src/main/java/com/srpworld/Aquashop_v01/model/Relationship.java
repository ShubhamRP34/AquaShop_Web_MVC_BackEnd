package com.srpworld.Aquashop_v01.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Relationship {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "fish_id", nullable = false)
	    private Fish fish;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "accesid", nullable = false)
	    private AquaAccessories aquaAccessories;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "fishfoodid", nullable = false)
	    private FishFood fishFood;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "plantsid", nullable = false)
	    private AquaPlants aquaPlants;
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "sturctid", nullable = false)
	    private AquariumStructures aquaStructure;
	    
	    
	    @ManyToOne(fetch = FetchType.LAZY)
	    @JoinColumn(name = "medid", nullable = false)
	    private FishMed fishMed;
	     

	    public AquaAccessories getAquaAccessories() {
			return aquaAccessories;
		}

		public void setAquaAccessories(AquaAccessories aquaAccessories) {
			this.aquaAccessories = aquaAccessories;
		}

		public FishFood getFishFood() {
			return fishFood;
		}

		public void setFishFood(FishFood fishFood) {
			this.fishFood = fishFood;
		}

		public AquaPlants getAquaPlants() {
			return aquaPlants;
		}

		public void setAquaPlants(AquaPlants aquaPlants) {
			this.aquaPlants = aquaPlants;
		}

		public AquariumStructures getAquaStructure() {
			return aquaStructure;
		}

		public void setAquaStructure(AquariumStructures aquaStructure) {
			this.aquaStructure = aquaStructure;
		}

		public FishMed getFishMed() {
			return fishMed;
		}

		public void setFishMed(FishMed fishMed) {
			this.fishMed = fishMed;
		}

		@Column(name = "relationship_type")
	    private String relationshipType;

	    @Column(name = "timestamp")
	    private Timestamp timestamp;

	    // Getters and Setters

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public Fish getFish() {
	        return fish;
	    }

	    public void setFish(Fish fish) {
	        this.fish = fish;
	    }

//	    public Accessories getAccessory() {
//	        return accessory;
//	    }
//
//	    public void setAccessory(Accessories accessory) {
//	        this.accessory = accessory;
//	    }

	    public String getRelationshipType() {
	        return relationshipType;
	    }

	    public void setRelationshipType(String relationshipType) {
	        this.relationshipType = relationshipType;
	    }

	    public Timestamp getTimestamp() {
	        return timestamp;
	    }

	    public void setTimestamp(Timestamp timestamp) {
	        this.timestamp = timestamp;
	    }
}
