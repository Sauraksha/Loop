package com.squaresum;
//wap to calculate the sum of square of no from 1 to 10
public class SumSquare {

	int sum;

	public void m1() {
		for (int i = 1; i <= 10; i++) {
			int count = i * i;
			sum = sum + count;

		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		SumSquare s = new SumSquare();
		s.m1();
	}

}
