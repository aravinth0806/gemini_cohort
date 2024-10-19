import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class ShuffleString {
	
	public static String methA(String str,int[] arr)
	{
		char[] charArray = str.toCharArray();
		String s="";
		Map<Integer, Character>map=new HashMap<Integer, Character>();
		for(int i=0;i<arr.length;i++)
		{
			map.put(arr[i], charArray[i]);
		}
		for(int i=0;i<map.size();i++)
		{
			s=s+map.get(i).toString();
		}
		return s;
	}
	@Test
	public void testA()
	{
		String str="codeleet";
		int[] a= {4,5,6,7,0,2,1,3};
		String methA = methA(str, a);
		System.out.println(methA);
	}

}
