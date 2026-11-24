package com.methodoverriding;

public class Grocery extends Product{
	
	double price = 400;
	String name = "Suger";
	
	@Override
	public int getDiscount(int discount) {
		discount = (int)((price*10)/100);
		return discount;
	}
	
	@Override
	public void showDetails() {
		 int discount = getDiscount(0);
System.out.println("==Grocery==");
	        System.out.println("Grocery Name: " + name);
	        System.out.println("Original Price: " + price);
	        System.out.println("Discount: " + discount);
	        System.out.println("Final Price: " + (price - discount));
	}

}


