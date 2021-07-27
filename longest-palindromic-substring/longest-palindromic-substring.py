class Solution:
    def longestPalindrome(self, s: str) -> str:
        s1=""
        lens1=0
        
        l = len(s)
        for i in range(len(s)):
            #odd
                start =i
                end =i
                while start>=0 and end <l and s[start]== s[end]:
                        if end-start+1>lens1:
                            s1=s[start:end+1]
                            lens1 = end-start+1
                        start-=1
                        end+=1
            # for even
        for i in range(len(s)):       
                start =i
                end =i+1
                while start>=0 and end <l and s[start]== s[end]:
                        if end-start+1>lens1:
                            s1=s[start:end+1]
                            lens1 = end-start+1
                        start-=1
                        end+=1
        return s1
        
        