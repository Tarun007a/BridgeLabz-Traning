package com.constructor.level1;

public class ProductInventory {
	private static int totalProducts;
	private String productName;
	private int price;
	
	// constructor
	public ProductInventory(String productName, int price) {
		this.productName = productName;
		this.price = price;
		totalProducts++;
	}
	
	// display product details
	public void displayProductDetails() {
		System.out.println(productName + " " + price);
	}
	
	// display total product
	public void displayTotalProducts() {
		System.out.println(totalProducts);
	}
	
	public static void main(String[] args) {
		ProductInventory p1 = new ProductInventory("Product name1", 100);
		p1.displayProductDetails();
		p1.displayTotalProducts();
	}

}
