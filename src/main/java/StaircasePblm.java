import org.junit.Test;

public class StaircasePblm {

	public static int staicase(int n, int res) {
		int i = 0, j = 1;

		for (int count = 0; count < n; count++) {
			res = i + j;
			i = j;
			j = res;
		}
		return res;
	}

	@Test
	public void testA() {
		int a = 3;
		int res = 0;
		int staicase = staicase(a, res);
		System.out.println(staicase);
	}

	@Test
	public void testB() {
		int a = 5;
		int res = 0;
		int staicase = staicase(a, res);
		System.out.println(staicase);
	}

}
