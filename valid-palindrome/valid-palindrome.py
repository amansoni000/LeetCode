class Solution:
    def isPalindrome(self, s: str) -> bool:
        s=s.lower()
        arr=[]
        for i in range(len(s)):
            if s[i].isalnum():
                arr.append(s[i])
        if arr==arr[::-1]:
            return True
        else:return False