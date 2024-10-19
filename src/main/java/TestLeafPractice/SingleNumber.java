package TestLeafPractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.Test;

public class SingleNumber {

	public static Integer methA(int[] arr) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				int cV = map.get(arr[i]);
				map.put(arr[i], cV + 1);
			} else
				map.put(arr[i], 1);
		}
		for (Entry<Integer, Integer> e : map.entrySet()) {
			if (e.getValue() >arr.length/2) {
				return e.getKey();
			}
		}
		return null;
	}

	@Test
	public void testA() {
		int[] arr = { 2, 2, 1 };
		Integer methA = methA(arr);
		System.out.println(methA);

	}

	@Test
	public void testB() {
		int[] arr = {2,2,1,1,1,2,2};
		Integer methA = methA(arr);
		System.out.println(methA);

	}

	@Test
	public void testC() {
		int[] arr = { 3,2,3 };
		Integer methA = methA(arr);
		System.out.println(methA);

	}
}
