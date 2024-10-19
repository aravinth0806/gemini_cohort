import org.junit.Test;

public class StringHalves {

	public static boolean methA(String str) {
		int mid = str.length() / 2;
		String substring1 = str.substring(0, mid).toLowerCase();
		String substring2 = str.substring(mid).toLowerCase();
		int count = 0;
		for (int i = 0; i < substring1.length(); i++) {
			if (substring1.charAt(i) == 'a' || substring1.charAt(i) == 'e' || substring1.charAt(i) == 'i'
					|| substring1.charAt(i) == 'o' || substring1.charAt(i) == 'u') {
				count++;
			}
		}
		for (int i = 0; i < substring2.length(); i++) {
			if (substring2.charAt(i) == 'a' || substring2.charAt(i) == 'e' || substring2.charAt(i) == 'i'
					|| substring2.charAt(i) == 'o' || substring2.charAt(i) == 'u') {
				count--;
			}
		}
		if (count == 0) {
			return true;
		} else {
			return false;

		}
	}

	@Test
	public void testA() {
		String str = "Book";
		boolean methA = methA(str);
		System.out.println(methA);
	}

	@Test
	public void testB() {
		String str = "TextBook";
		boolean methA = methA(str);
		System.out.println(methA);
	}

}
