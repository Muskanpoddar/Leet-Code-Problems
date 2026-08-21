class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        maxEnding = nums[0]
        minEnding = nums[0]
        answer = nums[0]

        for i in range( 1 , len(nums)):
            if nums[i] < 0:
             maxEnding , minEnding = minEnding , maxEnding
            maxEnding = max(nums[i]  , maxEnding * nums[i])
            minEnding = min(nums[i] , minEnding * nums[i])

            answer = max(answer , maxEnding)
        return answer
        