from sortedcontainers import SortedList
class Solution:
    def countSmaller(self, nums: List[int]) -> List[int]:
        result = []
        sort = SortedList()
        
        for v in reversed(nums):
            result.append(sort.bisect_left(v))
            sort.add(v)
            
        result.reverse()
        
        return result
        # s=[]
        # l=len(nums)
        # for i in range(l):
        #     count=0
        #     for j in range(i+1,l):
        #         if(nums[j]<nums[i]):
        #             count+=1
        #         else:continue
        #     s.append(count)
        # print(s)
        # return s
                