import java.util.Arrays;

import org.junit.Test;

public class FizzBuzzMethod2 {

	public static String[] methA(int n) {
		// TODO Auto-generated method stub

		String[] result = new String[n];

		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0 && i % 5 == 0)
				result[i - 1] = "FizzBuzz";
			else if (i % 3 == 0)
				result[i - 1] = "Fizz";
			else if (i % 5 == 0)
				result[i - 1] = "Buzz";
			else
				result[i - 1] = Integer.toString(i);

		}
		// System.out.println(Arrays.toString(result));
		return result;

	}

	@Test
	public void testA() {
		int a = 15;
		String[] methA = methA(a);
		System.out.println(Arrays.toString(methA));

	}

	@Test
	public void testB() {
		int a = 5;
		String[] methA = methA(a);
		System.out.println(Arrays.toString(methA));

	}

}
