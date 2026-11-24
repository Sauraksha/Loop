//sum of 100 natural number

package com.sumnaturalnumber;

public class SumNatural {
	

	int	sum;
	public void sum()
	{
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;
		}
		System.out.println("The addition is:"+sum);
	}
	
	public static void main(String[] args) {
		SumNatural sn=new SumNatural();
		sn.sum();
	}

}
