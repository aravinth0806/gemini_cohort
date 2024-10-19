import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class zeromove {
	
	public static int move(int[]arr)
	{
		Map<Integer,Integer>map=new HashMap<Integer, Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(map.containsKey(arr[i]))
			{
				int c=map.get(arr[i]);
				map.put(arr[i],c+1);
			}
			else map.put(arr[i], 1);
		}
			for(Entry<Integer, Integer> entry: map.entrySet() )
			{
				if(entry.getValue()>arr.length/2);
				{
					return entry.getKey();
				}
		}
		return -1;
	}
	@Test
	public void testA()
	{
		int[]a= {1,1,2,3,1,1,2};
		int move = move(a);
		System.out.println(move);
	}
	}
