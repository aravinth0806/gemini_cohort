package TestLeafPractice;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class Occurences {
	
	public static Map<Integer, Integer> methA(int[] arr)
	{
		Map<Integer,Integer> map= new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int curVal=map.get(arr[i]);
				map.put(arr[i], curVal+1);
			}
			else map.put(arr[i], 1);
		}
		return map;
	}
	@Test
	public void testA()
	{
		int[] a= {1,1,1,2,2,3};
		Map<Integer, Integer> methA = methA(a);
		System.out.println(methA);
		
	}

}
