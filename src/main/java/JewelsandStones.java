import org.junit.Test;

public class JewelsandStones {

	public int methA(String jwl, String stn) {
		int count = 0;
		for (char myStones : stn.toCharArray()) {
			if (jwl.indexOf(myStones) != -1) {
				count++;
			}
		}
		return count;

	}

	@Test
	public void testA() {
		String jwl = "aA";
		String stn = "aAAbbbb";
		int methA = methA(jwl, stn);
		System.out.println(methA);

	}

	@Test
	public void testB() {
		String jwl = "z";
		String stn = "ZZz";
		int methA = methA(jwl, stn);
		System.out.println(methA);

	}

}
