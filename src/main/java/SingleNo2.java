import org.junit.Test;

public class SingleNo2 {
		    public int singleNumber(int[] nums) {
	        int result=0;
	        for(int i=0; i<nums.length; i++) {
	            result = result^nums[i];
	        }
	        return result;
	    }
		    @Test
		    public void testA()
		    {
		    	int[] nums= {1,1,2,2,4};
		    	int singleNumber = singleNumber(nums);
		    	System.out.println(singleNumber);
		    }
		    
		    @Test
		    public void testB()
		    {
		    	int[] nums= {2};
		    	int singleNumber = singleNumber(nums);
		    	System.out.println(singleNumber);
		    }
	}
