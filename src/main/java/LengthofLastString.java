import java.util.Arrays;

import org.junit.Test;

public class LengthofLastString {

	public int methA(String str) {
		String[] result = str.trim().split(" ");
		System.out.println(Arrays.toString(result));
		if (result.length == 0) {

			return 0;
		} else {
			System.out.println(result.length);
			return result[result.length - 1].length();
			
		}

	}

	@Test
	public void testA() {
		String str = " Hello World ";
		int methA = methA(str);
		System.out.println(methA);
	}

	@Test
	public void testB() {
		String str = "  fly me  to the  moon  ";
		int methA = methA(str);
		System.out.println(methA);
	}

	@Test
	public void testC() {
		String str = "luffy is still joyboy";
		int methA = methA(str);
		System.out.println(methA);
	}
}

//input--string
//o/p--int
/*
 * 1. create a string[] 2. splitting the string based on spaces and storing it
 * to string[] 3. get last word using array length and return the length of the
 * word.
 */