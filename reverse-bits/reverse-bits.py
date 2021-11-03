class Solution:
    def reverseBits(self, n: int) -> int:
        s=bin(n)[2:]
        s=s[::-1]
        left_zero=(32-len(s))*'0'
        s = ''.join([s, left_zero])
        print(s)
        f=int(s,2)
        
        
        return f
    
        
        