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
public class TransactionalDetail {
	 	@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private int id;

//	    @ManyToOne(fetch = FetchType.LAZY)
//	    @JoinColumn(name = "customer_id", nullable = false)
//	    private Customer customer;

//	    @ManyToOne(fetch = FetchType.LAZY)
//	    @JoinColumn(name = "product_id", nullable = false)
//	    private Product product;

	    @Column(name = "prod_name", nullable = false)
	    private String productName;

	    @Column(name = "quantity", nullable = false)
	    private int quantity;

	    @Column(name = "amount", nullable = false)
	    private int amount;

	    @Column(name = "timestamp", nullable = false)
	    private Timestamp timestamp;

	    // Getters and Setters

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

//	    public Customer getCustomer() {
//	        return customer;
//	    }
//
//	    public void setCustomer(Customer customer) {
//	        this.customer = customer;
//	    }

//	    public Product getProduct() {
//	        return product;
//	    }
//
//	    public void setProduct(Product product) {
//	        this.product = product;
//	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }

	    public int getAmount() {
	        return amount;
	    }

	    public void setAmount(int amount) {
	        this.amount = amount;
	    }

	    public Timestamp getTimestamp() {
	        return timestamp;
	    }

	    public void setTimestamp(Timestamp timestamp) {
	        this.timestamp = timestamp;
	    }

}
