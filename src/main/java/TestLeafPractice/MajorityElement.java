package TestLeafPractice;

import java.util.Arrays;

import org.junit.Test;

public class MajorityElement {
	
	public int methA(int[] arr)
	{
		int n=arr.length;
		Arrays.sort(arr);
		return arr[n/2];
	}
	@Test
	public void testA()
	{
		int[] a= {3,2,3};
		int methA = methA(a);
		System.out.println(methA);
		
	}
	@Test
	public void testB()
	{
		int[] a= {2,2,1,1,1,2,2};
		int methA = methA(a);
		System.out.println(methA);
		
	}

}
