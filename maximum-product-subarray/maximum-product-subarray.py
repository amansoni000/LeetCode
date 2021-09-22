class Solution:
    def maxProduct(self, nums: List[int]) -> int:
        prod,prod2=1,1
        answer=nums[0]
        for i in range(len(nums)):
            prod = prod*nums[i]
            prod2 = prod2*nums[len(nums)-i-1] 
            answer = max(answer,prod,prod2)
            if nums[i] == 0:
                prod=1
            if nums[len(nums)-1-i] == 0:
                prod2=1
        return answer        