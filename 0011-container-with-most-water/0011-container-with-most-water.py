class Solution:
    def maxArea(self, height: List[int]) -> int:
        left = 0 
        right = len(height) -1
        answer =0

        while left < right :
            width = right - left 
            water_height = min(height[left] , height[right])
            area = width * water_height

            answer = max(answer , area)

            if height[left] <height[right]:
                left +=1
            else:
                right-=1
        return answer
        