package TestLeafPractice;

import org.junit.Test;

public class MergeStringsAlternately {

	public char[] methA(String word1, String word2) {
		int i = 0, j = 0, length;
		length = word1.length() + word2.length();
		char[] charIndex = new char[length];
		for (int c = 0; c < length;) {
			if(i<word1.length())
			{
				charIndex[c++]=word1.charAt(i++);
				System.out.println(charIndex);
			}
			if(j<word2.length())
			{
				charIndex[c++]=word2.charAt(j++);
				System.out.println(charIndex);
			}
		}
		return charIndex;

	}

	@Test
	public void testA() {
		String word1 = "abc";
		String word2 = "pqr";
		char[] methA = methA(word1, word2);
		System.out.println(methA);
	}
	@Test
	public void testB() {
		String word1 = "abcd";
		String word2 = "pq";
		char[] methA = methA(word1, word2);
		System.out.println(methA);
	}
	@Test
	public void testC() {
		String word1 = "ab";
		String word2 = "pqrs";
		char[] methA = methA(word1, word2);
		System.out.println(methA);
	}

}
