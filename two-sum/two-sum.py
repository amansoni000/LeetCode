class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        k=len(nums)
        for i in range(k):
            for j in range(i+1,k):
                if nums[i] + nums[j]==target:
                    return [i,j]
                
        