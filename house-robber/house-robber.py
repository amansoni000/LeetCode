class Solution:
    def rob(self, nums: List[int]) -> int:
        evenm=0
        oddm=0
        if len(nums)==1:
            return nums[0]
        elif len(nums)==2:
            return max(nums[0],nums[1])
            
        for i in range(len(nums)):
            if i%2==0:
                evenm+=nums[i]
                evenm=max(evenm,oddm)
            else:
                oddm+=nums[i]
                oddm=max(oddm,evenm)
        return max(oddm,evenm)
                
        
                    
            
            