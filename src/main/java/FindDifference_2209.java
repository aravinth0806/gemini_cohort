import org.junit.Test;

public class FindDifference_2209 {

	public char methA(String s, String t) {

		for (char myt : t.toCharArray()) {
			if (s.indexOf(myt) == -1) {
				// System.out.println(myt);
				return myt;
			}
		}
		return 0;

	}

	@Test
	public void testA() {
		String s = "abcd";
		String t = "abcde";
		char methA = methA(s, t);
		System.out.println(methA);
	}

	@Test
	public void testB() {
		String s = "";
		String t = "f";
		char methA = methA(s, t);
		System.out.println(methA);
	}

}
