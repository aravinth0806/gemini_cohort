import org.junit.Test;

public class NumberofSeniorCitizens {

	public int methA(String[] arr) {
		int counter = 0;
		for (String s : arr) {
			if (Integer.parseInt(s.substring(11, 13)) > 60) {
				counter++;
			}
		}
		return counter;
	}

	@Test
	public void testA() {
		String[] s = { "7868190130M7522", "5303914400F9211", "9273338290F4010" };
		int methA = methA(s);
		System.out.println(methA);
	}
	@Test
	public void testB() {
		String[] s = { "1313579440F2036","2921522980M5644" };
		int methA = methA(s);
		System.out.println(methA);
	}

}
