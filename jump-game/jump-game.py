class Solution:
    def canJump(self, nums: List[int]) -> bool:
        reach = nums[0]
        for i in range(len(nums)):
            if i > reach:
                return False
            reach = max(reach,nums[i]+i)
            if reach >= len(nums)-1:
                return True
       