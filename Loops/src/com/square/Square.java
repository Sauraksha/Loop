package com.square;
//write a java program to print the square of number from 1 to 10
public class Square {
	int mul;
	
	public void m1()
	{
		for(int i=1;i<=10;i++)
		{
			mul=i*i;
			System.out.println(mul);
		}
	}
	public static void main(String[] args) {
		Square s=new Square();
		s.m1();
	}

}
