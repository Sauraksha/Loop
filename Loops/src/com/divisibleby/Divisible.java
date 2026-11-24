package com.divisibleby;

public class Divisible {
	public void m1()
	{
		for(int i=1;i<=100;i++)
		{
			if(i%3==0 && i%5==0)
			{
		
				System.out.println(i);
			}
		}

		
	
	}
	public static void main(String[] args) {
		Divisible d=new Divisible();
		d.m1();
	}

}
