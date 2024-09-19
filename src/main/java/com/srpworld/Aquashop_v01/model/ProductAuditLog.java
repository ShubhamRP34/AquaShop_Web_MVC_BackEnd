package com.srpworld.Aquashop_v01.model;
import jakarta.persistence.*;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;

@Entity
public class ProductAuditLog {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "log_id")
	    private int logId;

	    @Column(name = "product_id", nullable = false)
	    private int productId;

	    @Column(name = "product_name")
	    private String productName;

	    @Column(name = "action", nullable = false)
	    private String action;

	    @Column(name = "timestamp", columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP", updatable = false, insertable = false)
	    private LocalDateTime timestamp;

	    @Column(name = "changed_by")
	    private String changedBy;

	    // Getters and Setters

	    public int getLogId() {
	        return logId;
	    }

	    public void setLogId(int logId) {
	        this.logId = logId;
	    }

	    public int getProductId() {
	        return productId;
	    }

	    public void setProductId(int productId) {
	        this.productId = productId;
	    }

	    public String getProductName() {
	        return productName;
	    }

	    public void setProductName(String productName) {
	        this.productName = productName;
	    }

	    public String getAction() {
	        return action;
	    }

	    public void setAction(String action) {
	        this.action = action;
	    }

	    public LocalDateTime getTimestamp() {
	        return timestamp;
	    }

	    public void setTimestamp(LocalDateTime timestamp) {
	        this.timestamp = timestamp;
	    }

	    public String getChangedBy() {
	        return changedBy;
	    }

	    public void setChangedBy(String changedBy) {
	        this.changedBy = changedBy;
	    }
}
