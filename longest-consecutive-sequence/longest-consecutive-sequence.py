class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        # nums.sort()
        # arr=[]
        # print(nums)
        # for i in range(len(nums)-1):
        #     if nums[i]==nums[i+1]-1:
        #         arr.append(nums[i])
        # print(arr)
        # if len(arr)!=0:
        #     return len(arr)+1
        # elif len(nums)==1:
        #     return len(arr)+1
        # elif len(nums)!=0 and len(arr)==0:
        #     return len(arr)+1
        # else:
        #     return len(arr)
        num=list(set(nums))
        num.sort()
        if len(nums)==0:
            return 0
        con=[]
        i=0
        while i<len(num):
            count=1
            j=i
            while j<len(num)-1 and num[j+1]==num[j]+1:
                count+=1
                j+=1
                i+=1
            i+=1
            if count>1:
                con.append(count)
        if len(con)==0:
            return 1
        else:
            return max(con)
        