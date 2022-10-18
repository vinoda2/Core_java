package com.xworkz.ecommerce.dto;

import java.io.Serializable;

public class ProductDTO implements Serializable {
	
	private String productName;
	private String productID;
	private boolean productAvailability;
	
	public ProductDTO(String productName, String productID, boolean productAvailability) {
		this.productName = productName;
		this.productID = productID;
		this.productAvailability = productAvailability;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public boolean isProductAvailability() {
		return productAvailability;
	}
	public void setProductAvailability(boolean productAvailability) {
		this.productAvailability = productAvailability;
	}
	@Override
	public String toString() {
		return "ProductDTO [productName=" + productName + ", productID=" + productID + ", productAvailability="
				+ productAvailability + "]";
	}
	
	
}
