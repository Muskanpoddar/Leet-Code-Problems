class Solution:
    def numberOfSubarrays(self, nums: list[int], k: int) -> int:
        prefix = 0
        count = 0
        seen = {0:1}

        for num in nums:
            if num % 2 == 1:
                prefix += 1
            needed = prefix - k

            if needed in seen :
                count += seen[needed]
            seen[prefix] = seen.get(prefix , 0) + 1
        return count