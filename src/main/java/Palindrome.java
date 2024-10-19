import java.util.Arrays;

import org.junit.Test;

public class Palindrome {

	public static boolean pali(int n, boolean b) {
		// TODO Auto-generated method stub

		String string = Integer.toString(n);
		char[] res = string.toCharArray();
		System.out.println(Arrays.toString(res));
		System.out.println(res.length);
		if (res.length % 2 == 0)
			b = false;
		else {
			for (int i = 0; i < res.length; i++) {
				for (int j = res.length - 1; j >= 0;) {
					if (res[i] == res[j]) {
						return true;
					}
					i = j; 
					break;

				}
			}
		}
		return b;

	}

	@Test

	public void testA() {
		int n = 156787651;
		boolean b = false;
		boolean pali = pali(n, b);
		System.out.println(pali);

	}

}
