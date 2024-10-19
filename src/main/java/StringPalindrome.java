import org.junit.Test;

public class StringPalindrome {
	
	public static boolean palind(String str)
	{
		String replaceAll = str.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
		String newStr="";
		char[] charArray=replaceAll.toCharArray();
		for(int i=charArray.length-1;i>=0;i--)
		{
			newStr=newStr+charArray[i];
		}
		return replaceAll.equals(newStr);
		
	}
	
	@Test
	public void TestA()
	{
		String str="A man, a plan, a canal: Panama";
		boolean palind = palind(str);
		System.out.println(palind);
		
	}
	@Test
	public void TestB()
	{
		String str="Race a car";
		boolean palind = palind(str);
		System.out.println(palind);
		
	}
	@Test
	public void TestC()
	{
		String str=" ";
		boolean palind = palind(str);
		System.out.println(palind);
		
	}


}
