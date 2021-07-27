class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        j=0
        for i in range(len(nums)):
            if nums[i] == val:
                nums[i]='_'
                
        for i in range(len(nums)):
            
            if  nums[j]=='_': 
                del nums[j]
                j-=1
            j+=1
        print(nums) 
        return len(nums)