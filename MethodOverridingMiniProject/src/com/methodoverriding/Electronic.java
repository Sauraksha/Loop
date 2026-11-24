package com.methodoverriding;

public class Electronic extends Product {
	
	double price = 10000.0;
	String name = "IPHONEPROMAX18";
	
	@Override
	public int getDiscount(int discount) {
		discount = (int)((price*15)/100);
		return discount;
	}
	
	@Override
	public void showDetails() {
		 int discount = getDiscount(0);
System.out.println("==Electronic==");
	        System.out.println("Product Name: " + name);
	        System.out.println("Original Price: " + price);
	        System.out.println("Discount: " + discount);
	        System.out.println("Final Price: " + (price - discount));
	}

}
