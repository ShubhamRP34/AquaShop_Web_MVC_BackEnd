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
public class AquariumStructures {

	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int sturctid;

	    @Column(name = "name", nullable = false)
	    private String name;

	    @Column(name = "description")
	    private String description;

	    @Column(name = "material")
	    private String material;

	    @Column(name = "dimensions")
	    private String dimensions;

	    @Column(name = "color")
	    private String color;

	    public Timestamp getTimestamp() {
			return timestamp;
		}

		public void setTimestamp(Timestamp timestamp) {
			this.timestamp = timestamp;
		}

		public int getPrice() {
			return price;
		}

		@Column(name = "price", nullable = false)
	    private int price;

	    @Column(name = "stock")
	    private int stock;

	    @Column(name = "image_url")
	    private String imageUrl;
	    
	    @Column(name = "timestamp", nullable = false)
	    private Timestamp timestamp;
	    
	    @OneToMany(mappedBy = "aquaStructure", cascade = CascadeType.ALL, orphanRemoval = true)
	    private List<Relationship> relationships;

	    // Getters and Setters

	 

	    public List<Relationship> getRelationships() {
			return relationships;
		}

		public void setRelationships(List<Relationship> relationships) {
			this.relationships = relationships;
		}

		public void setPrice(int price) {
			this.price = price;
		}


	    public int getSturctid() {
			return sturctid;
		}

		public void setSturctid(int sturctid) {
			this.sturctid = sturctid;
		}

		public String getName() {
	        return name;
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

	    public String getMaterial() {
	        return material;
	    }

	    public void setMaterial(String material) {
	        this.material = material;
	    }

	    public String getDimensions() {
	        return dimensions;
	    }

	    public void setDimensions(String dimensions) {
	        this.dimensions = dimensions;
	    }

	    public String getColor() {
	        return color;
	    }

	    public void setColor(String color) {
	        this.color = color;
	    }

	    public int getStock() {
	        return stock;
	    }

	    public void setStock(int stock) {
	        this.stock = stock;
	    }

	    public String getImageUrl() {
	        return imageUrl;
	    }

	    public void setImageUrl(String imageUrl) {
	        this.imageUrl = imageUrl;
	    }
}
