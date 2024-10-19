import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class OccurencesusingJunit {
	
	public boolean methA(int[] inp)
	{
		Map<Integer, Integer> result = new HashMap<Integer, Integer>();

		for (int i = 0; i < inp.length; i++) {
			if (result.containsKey(inp[i])) {
				Integer CurVal = result.get(inp[i]);
				result.put(inp[i], CurVal + 1);

			} else {
				result.put(inp[i], 1);
			}
			

		}
		
		System.out.println(result);
		Collection<Integer> values = result.values();
		 System.out.println(values);
		Set<Integer> set=new HashSet<>(values);
		System.out.println(set);
		return set.size()==values.size();
	}
	
	@Test
	public void testA()
	{
		int[] inp = {1,2,2,1,1,3,3};
		boolean val=methA(inp);
		System.out.println(val);
	}
	
	@Test
	public void testA1()
	{
		int[] inp = {1,2,2,1,1,3};
		boolean val=methA(inp);
		System.out.println(val);
	}
	
	@Test
	public void testA2()
	{
		int[] inp = {1,2,3,4};
		boolean val=methA(inp);
		System.out.println(val);
	}

}
