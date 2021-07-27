class Solution:
    def search(self, nums: List[int], target: int) -> int:
        j=0
        k=-1
        for i in nums:
            if i==target:
                return j
            else:
                j+=1
        return k