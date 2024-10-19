import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class SingleNumber {

	public int methodA(int[] inp) {
		// TODO Auto-generated method stub

		// int[] inp = {1,2,3,4};

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
		int key=0;
		for (Entry<Integer, Integer> entry : result.entrySet()) {
			if (entry.getValue() == 1) {
				key = entry.getKey();
			}
		}
		return key;
	}
	
	@Test
	public void testA()
	{
		int[] inp = { 1, 2, 2, 1, 3, 3 };
		int methodA = methodA(inp);
		System.out.println(methodA);
	}
	@Test
	public void testB()
	{
		int[] inp = { 1, 2, 2, 3, 3 };
		int methodA = methodA(inp);
		System.out.println(methodA);
	}
	@Test
	public void testC()
	{
		int[] inp = { 1 };
		int methodA = methodA(inp);
		System.out.println(methodA);
	}


}
