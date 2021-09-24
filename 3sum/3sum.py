class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        nums = sorted(nums)
        result = set()
        for i in range(len(nums)):
            l = i + 1
            r = len(nums) - 1
            target = 0 - nums[i]
            while l < r:
                if nums[l] + nums[r] == target:
                    result.add((nums[i], nums[l], nums[r]))
                    l += 1
                    r -= 1
                elif nums[l] + nums[r] < target:
                    l += 1
                else:
                    r -= 1
        return list(result)
#         p=[]
#         s=[]
        
#         for a in range(len(nums)-1):
#             for b in range(a+1,len(nums)):
#                 for c in range(b+1,len(nums)):
#                     if nums[a]+nums[b]+nums[c]==0:
#                         # print(f'[{nums[a]},{nums[b]},{nums[c]}]',end=",")
                        
#                         p.append([nums[a], nums[b], nums[c]])

#         for a in range(len(p)):
#             p[a].sort()
#         print(p)
#         print(len(p))
# #         if len(p)==2 :
            
# #             if p[0]==p[1]:
# #                 s.append(p[0])
# #                 print("i ma here1")
# #                 return s
# #             else:
# #                 print("i ma here")
# #                 return p
            
        
#         for a in range(len(p)):
#             for b in range(a+1,len(p)):
#                 if p[a]==p[b] and a!=b: i=1
#                 else:s.append(p[b])
#         if len(p)!=0 and len(s)==0:
#             s.append(p[0])
#         print(s)
#         return s   
                      

            
                   # s.append(p[a])   
                
        
                    