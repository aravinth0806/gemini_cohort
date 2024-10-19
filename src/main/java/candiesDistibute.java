import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

public class candiesDistibute {

	public static int candy(int[] arr) {
		Set<Integer> set = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			set.add(arr[i]);
		}
		System.out.println(set);
		if (set.size() > arr.length / 2) {
			return arr.length / 2;
		} else {
			return set.size();
		}
	}

	@Test
	public void testA() {
		int[] a = { 1, 1, 2, 2, 3, 3 };
		int candy = candy(a);
		System.out.println(candy);
	}

	@Test
	public void testB() {
		int[] a = { 1, 1, 2, 3 };
		int candy = candy(a);
		System.out.println(candy);
	}

	@Test
	public void testC() {
		int[] a = { 1, 1, 1, 1 };
		int candy = candy(a);
		System.out.println(candy);
	}

}
