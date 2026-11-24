package com.evenodd;

import java.security.DomainCombiner;

public class EvenOdd {
	
	public void print()
	{
		for(int i=2;i<=50;i++)
		{
			if(i%2==0)
			{
				System.out.println(i);
				
				
			}
			
			
		}
		
	}
	public static void main(String[] args) {
		EvenOdd eo=new EvenOdd();
		System.out.println("Even Number");
		eo.print();
		
	}
	 

}
