class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(nums, result, new ArrayList<Integer>(), new boolean[nums.length]);
        return result;
    }

    private void backtrack(int[] nums, List<List<Integer>> result, List<Integer> tempList, boolean[] used) {
        if (tempList.size() == nums.length) {
            // add a copy of tempList (important â don't add the same list reference)
            result.add(new ArrayList<>(tempList));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) continue;
            used[i] = true;
            tempList.add(nums[i]);

            backtrack(nums, result, tempList, used);

            // backtrack
            used[i] = false;
            tempList.remove(tempList.size() - 1);
        }
    }
}
