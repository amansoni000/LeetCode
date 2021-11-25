class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int lowest=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        int j=0;
        int profit=0;
        for(int i=0;i<n-1;i++){
            if(prices[i+1]-prices[i]>0){
                lowest = Math.min(prices[i],lowest);
                high = prices[i+1];
                profit = Math.max(profit,high-lowest);
            }
        }
        return profit;
    }
}