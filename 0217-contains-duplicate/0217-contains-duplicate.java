class Solution {
    public boolean containsDuplicate(int[] nums) {
         Set<Integer> seen = new HashSet<>();

        // Iterate through the array
        for (int num : nums) {
            // If the element is already in the set, return true (duplicate found)
            if (!seen.add(num)) {
                return true;
            }
        }    
        return false;
    }
}