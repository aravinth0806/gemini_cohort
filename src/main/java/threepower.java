import org.junit.Test;

public class threepower {

	public static boolean methA(int n,boolean b) {
		// TODO Auto-generated method stub
			
		while(n%3==0)
		{
			n=n/3;
			if(n==1)
			{
				b= true;
			}
			else b= false;
		}
		return b;

	}
	@Test
	public void testA()
	{
		int n=24;
		boolean b=false;
		boolean methA = methA(n,b);
		System.out.println(methA);
	}

}
