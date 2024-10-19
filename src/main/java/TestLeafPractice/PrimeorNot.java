package TestLeafPractice;

import org.junit.Test;

public class PrimeorNot {
	public static void methA(int n)
	{
		int count=0;
		for(int i=2;i<=n/2;)
		{
			if(n%i==0) count+=1;
			break;
		}
		if(count!=0)
		{
			System.out.println("Given number "+n+" is not a prime number");
		}
		else System.out.println("Given number "+n+" is a prime number");
	}
	@Test
	public void testA()
	{
		int a=7;
		methA(a);
	}
	@Test
	public void testB()
	{
		int a=5;
		methA(a);
	}

}
