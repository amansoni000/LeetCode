class Solution:
    def reverseString(self, s: List[str]) -> List[str]:
        # s = s[::-1]
        for i in range(len(s)//2):
            s[i] , s[len(s)-i-1] = s[len(s)-i-1] , s[i]
        """
        Do not return anything, modify s in-place instead.
        """
        