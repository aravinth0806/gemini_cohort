package TestLeafPractice;

import java.util.Arrays;

import org.junit.Test;

public class MoveZeroes {

	public int[] methA(int[] arr) {
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j++;
			}
		}
		for (int i = j; i < arr.length; i++) {
			arr[i] = 0;
		}
		return arr;
	}

	@Test
	public void testA() {
		int[] a = { 0, 1, 0, 3, 12 };
		int[] methA = methA(a);
		System.out.println(Arrays.toString(methA));
	}
	@Test
	public void testB() {
		int[] a = { 0};
		int[] methA = methA(a);
		System.out.println(Arrays.toString(methA));
	}

}
