import org.junit.Test;

public class AllaAppearBeforb {
	
	public boolean methA(String s)
	{
		
		if(!s.contains("ba"))
		{
			return true;
		}
		return false;
	}
	
	@Test
	public void testA()
	{
		String s="aaabbb";
		boolean methA = methA(s);
		System.out.println(methA);
	}
	@Test
	public void testB()
	{
		String s="aaabbba";
		boolean methA = methA(s);
		System.out.println(methA);
	}
	@Test
	public void testC()
	{
		String s="a";
		boolean methA = methA(s);
		System.out.println(methA);
	}

}
