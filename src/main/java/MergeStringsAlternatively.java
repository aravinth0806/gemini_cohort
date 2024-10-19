import org.junit.Test;

public class MergeStringsAlternatively {

	public static char[] methA(String word1,String word2) {
		// TODO Auto-generated method stub
	
		int length;
		
		length=word1.length()+word2.length();
		int count=0,i=0,j=0;
				
		char[] res=new char[length];
			for(count=0;count<length;count++)
			{
				//res[i]=word1.charAt(i);
				if(count%2==0) {
				res[count]=word1.charAt(i);
				i++;}
				else {
				res[count]=word2.charAt(j);
				j++;
			}
			
		}
			return res;
	}
	@Test
	public void testA()
	{
		String word1="abcd",word2="pqr";//apbqcrd
		char[] methA = methA(word1, word2);
		System.out.println(methA);
	}
}