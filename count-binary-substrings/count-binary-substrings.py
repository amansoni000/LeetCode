class Solution:
    def countBinarySubstrings(self, s: str) -> int:
        count = 0
        same = 1
        old = 0
        for i in range(1,len(s)):
            if s[i]==s[i-1]:
                same+=1
            else:
                count += min(old,same)
                old = same
                same = 1
        return count+min(old,same)
        