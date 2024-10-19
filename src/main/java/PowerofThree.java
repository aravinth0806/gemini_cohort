import org.junit.Test;

public class PowerofThree {

	public static boolean powerofThree(int n) {
		// TODO Auto-generated method stub
		for (int i = 0; i < n; i++) {
			if (Math.pow(3, i) == n) {
				return true;
			}
		}
		return false;
	}
	@Test
	public void testA()
	{
		int a=27;
		boolean b = powerofThree(a);
		System.out.println(b);
	}
	@Test
	public void testB()
	{
		int a=-1;
		boolean b = powerofThree(a);
		System.out.println(b);
	}
	@Test
	public void testC()
	{
		int a=0;
		boolean b = powerofThree(a);
		System.out.println(b);
	}

}
