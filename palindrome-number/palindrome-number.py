class Solution:
    def isPalindrome(self, x: int) -> bool:
        y=str(x)
        k=y
        y=y[::-1]
        if x<=(2**31)-1 and x>=-2**31:
            if y == k:
                return True
            else: return False
        