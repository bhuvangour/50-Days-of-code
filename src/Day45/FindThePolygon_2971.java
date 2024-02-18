package Day45;
import java.util.*;
public class FindThePolygon_2971 {
	 public long largestPerimeter(int[] nums) {
	        // code here
	        long sum = 0;
	        Arrays.sort(nums);
	        
	        for (int num : nums) {
	            sum += num;
	        }
	        
	        int n = nums.length;
	        
	        for (int i = n - 1; i >= 2; i--) {
	            
	            sum -= nums[i];
	            
	            if (sum > nums[i]) {
	                return sum + nums[i];
	            }
	        }
	        
	        return -1;
	    }
}
