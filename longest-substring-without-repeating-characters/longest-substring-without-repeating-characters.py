class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        s1 = set()
        i=0
        res = 0
        for r in range(len(s)):
            while s[r] in s1:
                s1.remove(s[i])
                i+=1
            s1.add(s[r])
            res = max(res,r-i+1)
        return res    
            
        