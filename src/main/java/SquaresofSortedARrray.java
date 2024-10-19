import java.util.Arrays;

import org.junit.Test;

public class SquaresofSortedARrray {

	public static int[] squareArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] *= arr[i];
		}
		Arrays.sort(arr);
		return arr;

	}
	@Test
	public void testA()
	{
		int[]a= {-4,-1,0,3,10};
		int[] squareArray = squareArray(a);
		System.out.println(Arrays.toString(squareArray));
	}
	@Test
	public void testB()
	{
		int[]a= {-7,-3,2,3,11};
		int[] squareArray = squareArray(a);
		System.out.println(Arrays.toString(squareArray));
	}


}
