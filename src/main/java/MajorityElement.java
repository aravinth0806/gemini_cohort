import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;



public class MajorityElement {

	public Integer methA(int[] inp) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < inp.length; i++) {
			if (map.containsKey(inp[i])) {
				int curval = map.get(inp[i]);
				map.put(inp[i], curval + 1);
			} else {
				map.put(inp[i], 1);
			}
		}
		 System.out.println(map);
		//Collection<Integer> values = map.values();
		
		//return values;
		for(Entry<Integer,Integer>entry : map.entrySet())
		{
			if(entry.getValue()>=inp.length/2)
			{
				System.out.println(entry.getKey());
				return entry.getKey();
			}
		}
		return -1;

	}

	@Test
	public void testA() {
		int[] inp = { 1, 1, 1, 2, 3, 3,3,3 };
		Integer methodA = methA(inp);
		
		System.out.println(methodA);
		
	}
}
