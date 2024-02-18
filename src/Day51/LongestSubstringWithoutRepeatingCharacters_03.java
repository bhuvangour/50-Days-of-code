package Day51;
import java.util.*;
public class LongestSubstringWithoutRepeatingCharacters_03 {
	 public int lengthOfLongestSubstring(String s) {
	        
	        int start = 0, end = 0, ans = 0;

	        List<Character> list = new ArrayList<>();

	        while (end < s.length()) {
	            if (!list.contains(s.charAt(end))) {
	                list.add(s.charAt(end));
	                end++;
	                ans = Math.max(ans, list.size());
	            } else {
	                list.remove(Character.valueOf(s.charAt(start)));
	                start++;
	            }
	        }
	        return ans;
	        
	    }
}
