package Day32;

import java.util.ArrayList;
import java.util.List;
class RemoveElement {
    public int removeElement(List<Integer> nums, int val) {
        List<Integer> ans = new ArrayList<>();
        for (int num : nums) {
            if (num != val) {
                ans.add(num);
            }
        }
        nums.clear(); // Clear the original list
        nums.addAll(ans); // Copy the elements from ans back to nums
        return ans.size();
    }
}
