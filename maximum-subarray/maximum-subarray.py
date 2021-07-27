class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        l = len(nums)
        temp = 0
        max1 =-inf
        for i in range(l):
                temp+=nums[i]
                max1=max(max1,temp)
                if temp<0:
                     temp=0
        return max1