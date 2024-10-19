import org.junit.Test;

public class ShuffleStringusingForloop {

	public static String methA(String s, int[] arr) {
		char[] temp = new char[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp[arr[i]] = s.charAt(i);
			//System.out.println(temp);
		}
		//System.out.println(s.charAt(1));
		return new String(temp);
	}

	@Test
	public void testA() {
		String s = "codeleet";
		int[] a = { 4, 5, 6, 7, 0, 2, 1, 3 };
		String methA = methA(s, a);
		System.out.println(methA);

	}

}
