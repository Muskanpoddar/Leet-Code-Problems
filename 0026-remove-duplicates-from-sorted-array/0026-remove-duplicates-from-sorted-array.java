class Solution {
    public int removeDuplicates(int[] nums) {
     if (nums.length == 0) return 0; // Edge case: empty array

        int i = 0; // Slow pointer

        for (int j = 1; j < nums.length; j++) { // Fast pointer starts from 1
            if (nums[j] != nums[i]) { // If a new unique element is found
                i++; // Move slow pointer forward
                nums[i] = nums[j]; // Update the next unique position
            }
        }
        
        return i + 1; // The length of unique elements
       
    }
}

