package com.factorial;

public class Factorial {
	int i;
	int fact=1;
	
	public void m1()
	{
		for(i=1;i<=5;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is "+fact);
	}
	public static void main(String[] args) {
		Factorial f=new Factorial();
		f.m1();
	}
	

}
