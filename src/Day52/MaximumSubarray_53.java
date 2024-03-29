package Day52;

public class MaximumSubarray_53 {
	 public int maxSubArray(int[] nums) 
	    {
	        // Kande's Algorithm:
	        
	        int maxSum = Integer.MIN_VALUE;
	        int currSum = 0;
	        
	        for(int i = 0 ; i < nums.length ; i++)
	        {
	            currSum = Math.max(( currSum + nums[ i ] ), nums[ i ] );
	            maxSum = Math.max( maxSum, currSum );
	        }
	        
	        return maxSum;
	        
	    }
}
