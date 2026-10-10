class Solution:
    def numSubarraysWithSum(self, nums: list[int], goal: int) -> int:
        prefix = 0
        count = 0

        seen = {0:1}

        for num in nums:
            prefix += num

            needed = prefix - goal
            if needed in seen:
                count += seen[needed]
            if prefix in seen:
                seen[prefix] += 1
            else:
                seen[prefix] = 1
        return count