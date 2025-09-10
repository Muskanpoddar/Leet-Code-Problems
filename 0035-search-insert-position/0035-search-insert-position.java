public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;                    // Initialize the left pointer at the start of the array
        int right = nums.length - 1;    // Initialize the right pointer at the end of the array

        while (left <= right) {         // Continue searching while the pointers haven't crossed
            int mid = left + (right - left) / 2;  // Calculate the mid index to avoid overflow

            if (nums[mid] == target) {  // If the middle element is equal to the target
                return mid;             // We've found the target, return its index
            } else if (nums[mid] < target) {
                left = mid + 1;         // Target is on the right half, move the left pointer
            } else {
                right = mid - 1;        // Target is on the left half, move the right pointer
            }
        }

        // If the target is not found, 'left' will be the correct insertion point
        return left;
    }
}