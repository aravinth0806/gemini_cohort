import java.util.Arrays;

import org.junit.Test;

public class MoveZeroes {

	public static int[] moveZero(int[]arr,int j) {
		// TODO Auto-generated method stub
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[j] = arr[i];
				j++;
				//System.out.println(arr[i]);

			}
		}
		//System.out.println(j);
		for(int i=j;i<arr.length;i++)
		{
			arr[i]=0;
		}
		return arr;

	}
	@Test
	public void testA()
	{
		int[] arr = { 0, 1, 0, 3, 12 };
		int j = 0;
		int[] moveZero = moveZero(arr, j);
		System.out.println(Arrays.toString(moveZero));
	}
	@Test
	public void testB()
	{
		int[] arr = { 0, 0, 0, 3, 12 };
		int j = 0;
		int[] moveZero = moveZero(arr, j);
		System.out.println(Arrays.toString(moveZero));
	}
}
