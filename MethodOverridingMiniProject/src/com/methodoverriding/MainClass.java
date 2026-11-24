package com.methodoverriding;

public class MainClass {
	
	public static void main(String[] args) {
	Grocery g=new Grocery();
//		System.out.println(g.getDiscount(15));
		g.showDetails();
		
		System.out.println("----------------------");
		
		Electronic e=new Electronic();
//		
		e.showDetails();
		
	}

}
