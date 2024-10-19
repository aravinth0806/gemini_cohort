import org.junit.Test;

public class FirstPalindromeString {

	public static String methA(String[] arr) {
		String s = "", s1 = "";
		for (int i = 0; i < arr.length; i++) {
			s = arr[i];
			char[] charindex = s.toCharArray();
			for (int j = charindex.length - 1; j >= 0; j--) {
				s1 = s1 + charindex[j];
			}

			if (s.equals(s1)) {
				break;
			} else {
				s1 = "";
			}

		}
		return s1;
	}

	@Test
	public void testA() {
		String[] a = { "abc", "car", "ada", "racecar", "cool" };
		String methA = methA(a);
		System.out.println(methA);
	}

	@Test
	public void testB() {
		String[] a = { "notapalindrome", "racecar" };
		String methA = methA(a);
		System.out.println(methA);
	}

	@Test
	public void testc() {
		String[] a = { "def", "ghi" };
		String methA = methA(a);
		System.out.println(methA);
	}

}
