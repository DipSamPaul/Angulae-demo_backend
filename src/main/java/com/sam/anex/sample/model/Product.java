package com.sam.anex.sample.model;

public class Product {
	private String ProductName; 
	private String ProductDescription;
	private double ProductPrice;
	
	public Product(String productName, String productDescription, double productPrice) {
		super();
		ProductName = productName;
		ProductDescription = productDescription;
		ProductPrice = productPrice;
	}
	
	public String getProductName() {
		return ProductName;
	}
	public void setProductName(String productName) {
		ProductName = productName;
	}
	public String getProductDescription() {
		return ProductDescription;
	}
	public void setProductDescription(String productDescription) {
		ProductDescription = productDescription;
	}
	public double getProductPrice() {
		return ProductPrice;
	}
	public void setProductPrice(double productPrice) {
		ProductPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Product [ProductName=" + ProductName + ", ProductDescription=" + ProductDescription + ", ProductPrice="
				+ ProductPrice + "]";
	}

}
