package com.armstrong;

public class Armstrong {

	public static void main(String[] args) {
		int num=153;
		int temp=num;
		int count=0;
		int sum=0;
		
		int rem=0;
		while(temp>0)
		{
			count++;
			temp=temp/10;
				
		}
		temp=num;
		
		while(temp>0)
		{
			rem=temp%10;
			int power=1;
			for(int i=1;i<=count;i++)
			{
				power=power*rem;
			}
		
		sum=sum+power;
		temp=temp/10;
		}
		
		if(sum==num)
		{
			System.out.println("number is armstrong");
		}
		else
		{
			System.out.println("not armstrong");
		}
	}
}
