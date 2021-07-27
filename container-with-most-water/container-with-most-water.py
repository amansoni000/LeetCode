class Solution:
    def maxArea(self, height: List[int]) -> int:
        i,k,maximum,l=0,0,0,len(height)
        j=l-1
        for surf in range(l):
                if height[i] < height[j]:   
                         maximum = (j-i) * height[i]
                         i+=1
                else:
                    maximum = (j-i) * height[j]
                    j-=1
                k=max(maximum,k)
        return abs(k)   
    
            
        