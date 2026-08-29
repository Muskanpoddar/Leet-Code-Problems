class Solution:
    def lexicographicallySmallestArray(self, nums: List[int], limit: int) -> List[int]:
        n = len(nums)
        arr = [(nums[i], i) for i in range(n)]

        arr.sort()
        answer = nums[:]
        start =0
        for end in range(1 , n+1):
            if end == n or arr[end][0] - arr[end -1][0] > limit:
                values = []
                indices =[]
                for i in range(start , end):
                    values.append(arr[i][0])
                    indices.append(arr[i][1])
                indices.sort()

                for i in range(len(values)):
                    answer[indices[i]] = values[i]
                start = end
        return answer        