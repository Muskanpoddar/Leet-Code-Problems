class Solution:
    def splitArray(self, nums: list[int], k: int) -> int:
        left = max(nums)
        right = sum(nums)

        while left < right:
            mid =(left + right) // 2

            currsum = 0
            subarr = 1

            for num in nums:
                if currsum + num > mid:
                    subarr += 1
                    currsum = 0
                currsum += num

            if subarr <= k:
               right = mid
            else:
               left = mid + 1
        return left