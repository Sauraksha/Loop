package co.sumofodd;
//wap to calculate the sum of odd no from 1 to 20
public class SumOfOdd {
	int sum;
	public void m1()
	{
		for (int i=1;i<=20;i++)
		{
			if(i%2==1)
			{
				System.out.println(i);
				sum=sum+i;
				System.out.println("the addition is:"+sum);
			}
		   
		}
	}
 public static void main(String[] args) {
	SumOfOdd s=new SumOfOdd();
	s.m1();
}
}
