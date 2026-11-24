package com.fibonacciseries;
import java.util.Scanner;
public class fibonacci {

	// 0 1 1 2 3 5 8 13.......
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of term:");
		int num=sc.nextInt();
	
		int a=0;
		int b=1;
		int c;
		System.out.println("Fibonacci series is:");
		 for(int i=1;i<=num;i++)
		 {
			 
			 System.out.println(a+" ");
			 c=a+b;
			 a=b;
			 b=c;
		 }
		 
	}
}
