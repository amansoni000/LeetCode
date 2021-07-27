class Solution:
    def maxProfit(self, prices: List[int]) -> int:
        minm=prices[0]
        max1=0
        for i in range(len(prices)):
            if prices[i]<minm:
                minm=prices[i]
            elif prices[i]-minm>max1:
                max1=prices[i]-minm
            
        return max1
            
