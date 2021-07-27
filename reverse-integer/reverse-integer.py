import sys
class Solution:
    def reverse(self, x: int) -> int:
        
        y = str(x)
        
        if x>=0:
            y = y[::-1]
            if int(y)<=(2**31)-1:
                return(int(y))
            else:
                return 0;
        elif x<0:
            z=0-x
            k=str(z)
            k = k[::-1]
            if int(k)<=(2**31)-1 and int(k)>=-2**31:
                return(0-int(k))
            else:
                return 0
        
        
        
        
        