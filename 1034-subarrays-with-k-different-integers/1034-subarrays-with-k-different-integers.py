class Solution:
    def subarraysWithKDistinct(self, nums: list[int], k: int) -> int:
        def atMost(limit):
            left =0
            count = 0
            freq = {}

            for right in range(len(nums)):
                num = nums[right]
                freq[num] = freq.get(num , 0) + 1

                while len(freq) > limit:
                    freq[nums[left]] -= 1

                    if freq[nums[left]] == 0:
                        del freq[nums[left]]
                    left += 1
                count += right - left + 1
            return count
        return atMost(k) - atMost(k-1)

