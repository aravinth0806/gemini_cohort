package TestLeafPractice;

import java.util.Arrays;

import org.junit.Test;

public class LongestCommonPrefix {

	public String methA(String[] arr) {
		int i = 0;
		Arrays.sort(arr);
		String s = arr[0];
		String s1 = arr[arr.length - 1];
		// char[] charArray = s.toCharArray();
		// char[] charArray2 = s1.toCharArray();
		while (i < s.length() && i < s1.length()) {
			if (s.charAt(i) == s1.charAt(i))
				i++;
			else
				break;

		}
		return s.substring(0, i);

	}

	@Test
	public void testA() {
		String[] s = { "flower", "flow", "flight" };
		String methA = methA(s);
		System.out.println(methA);

	}
	@Test
	public void testB() {
		String[] s = {"dog","racecar","car"};
		String methA = methA(s);
		System.out.println(methA);

	}

}
