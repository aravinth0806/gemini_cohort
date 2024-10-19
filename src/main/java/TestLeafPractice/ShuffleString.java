package TestLeafPractice;

import org.junit.Test;

public class ShuffleString {

	public char[] methA(String str, int[] arr) {
		char[] charInd = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {
			charInd[arr[i]] = str.charAt(i);
		}
		return charInd;
	}

	@Test
	public void testA() {
		String s = "codeleet";
		int[] a = { 4, 5, 6, 7, 0, 2, 1, 3 };
		char[] methA = methA(s, a);
		System.out.println(methA);

	}

}
