package TestLeafPractice;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ArrayDuplicates {
	
	public static List<Integer> methA(int[] arr)
	{
		List<Integer> list= new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					if(!list.contains(arr[i]))
					list.add(arr[i]);
				}
			}
		}
		return list;
		
	}
	@Test
	public void testA()
	{
		int[] a= {1,1,2,2,3,3,4,4,5,6};
		List<Integer> methA = methA(a);
		System.out.println(methA);
	}
	@Test
	public void testB()
	{
		int[] a= {1};
		List<Integer> methA = methA(a);
		System.out.println(methA);
	}

}
