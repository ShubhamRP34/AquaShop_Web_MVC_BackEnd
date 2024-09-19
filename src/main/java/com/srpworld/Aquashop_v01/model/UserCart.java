package com.srpworld.Aquashop_v01.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class UserCart {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "cart_id")
	    private int cartId;

//	    @ManyToOne(fetch = FetchType.LAZY)
//	    @JoinColumn(name = "cust_id", nullable = false)
//	    private Customer customer;

	    @Column(name = "prod_name", nullable = false)
	    private String productName;

	    @Column(name = "prod_id", nullable = false)
	    private int productId;

	    @Column(name = "availability", nullable = false)
	    private int availability;

	    @Column(name = "timestamp", nullable = false)
	    private Timestamp timestamp;

	    // Getters and Setters

	    public int getCartId() {
	        return cartId;
	    }

	    public void setCartId(int cartId) {
	        this.cartId = cartId;
	    }

//	    public Customer getCustomer() {
//	        return customer;
//	    }
//
//	    public void setCustomer(Customer customer) {
//	        this.customer = customer;
//	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public int getProductId() {
	        return productId;
	    }

	    public void setProductId(int productId) {
	        this.productId = productId;
	    }

	    public int getAvailability() {
	        return availability;
	    }

	    public void setAvailability(int availability) {
	        this.availability = availability;
	    }

	    public Timestamp getTimestamp() {
	        return timestamp;
	    }

	    public void setTimestamp(Timestamp timestamp) {
	        this.timestamp = timestamp;
	    }
	
}
