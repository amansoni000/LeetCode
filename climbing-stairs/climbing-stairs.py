class Solution:
    def climbStairs(self, n: int) -> int:
        a=1
        b=1
        for i in range(n):
            c=b
            b=a+b
            a=c
        return a
            
            
            
        