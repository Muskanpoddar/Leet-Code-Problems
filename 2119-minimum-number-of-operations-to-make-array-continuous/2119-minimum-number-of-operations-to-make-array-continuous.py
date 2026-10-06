class Solution:
    def minOperations(self, nums: list[int]) -> int:
        n = len(nums)

        nums = sorted(set(nums))

        left = 0
        answer = n

        for right in range(len(nums)):

            while nums[right] - nums[left] >= n:
                left += 1

            unique_count = right - left + 1

            answer = min(answer, n - unique_count)

        return answer