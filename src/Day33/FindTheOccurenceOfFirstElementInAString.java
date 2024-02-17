package Day33;

public class FindTheOccurenceOfFirstElementInAString {
	 public int removeElement(int[] nums, int val) {
	        int index = 0; // index to track the position where non-val elements should be placed
	        for (int i = 0; i < nums.length; i++) {
	            if (nums[i] != val) {
	                nums[index] = nums[i];
	                index++; // Move the index forward only when a non-val element is found
	            }
	        }
	        return index; // index now represents the new size of the array
	    }
}