public class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        
        while (mid <= high) {
            if (nums[mid] == 0) {
                // Swap with low pointer, move both low and mid forward
                swap(nums, low, mid);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                // White color is in the correct position, just advance mid
                mid++;
            } else { // nums[mid] == 2
                // Swap with high pointer, move high backward
                // Note: mid is NOT incremented because the swapped element at mid needs to be inspected
                swap(nums, mid, high);
                high--;
            }
        }
    }
    
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
