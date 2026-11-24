package com.armstrong;

public class Number {
	
	//suppose no in 123 then armstrong number will be 1^3 +2^3 +3^3
	
public static void main(String[] args) {
	int num=153;
	int rem;
	int sum=0;
	int temp=num;
	
	while(num>0)
	{
		rem=num%10;
		sum=sum+rem*rem*rem;
		num=num/10;
//		System.out.println(sum);
	}
	System.out.println(sum);
	if (sum==temp)
	{
		System.out.println("number is armstrong");
	}
	else
	{
		System.out.println("number is not armstrong");
	}
}

}
