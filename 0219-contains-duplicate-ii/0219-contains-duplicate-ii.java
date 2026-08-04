import java.util.HashSet;
import java.util.Set;

public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> window = new HashSet<>();
        
        for (int i = 0; i < nums.length; i++) {
            // If the element is already in our set, a duplicate within distance k exists
            if (window.contains(nums[i])) {
                return true;
            }
            
            // Add current number to the set
            window.add(nums[i]);
            
            // Maintain sliding window size: remove the element outside distance k
            if (window.size() > k) {
                window.remove(nums[i - k]);
            }
        }
        
        return false;
    }
}