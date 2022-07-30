class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE, profit = 0;
        for(int i = 0; i < prices.length - 1;i++){
            if(prices[i+1] > prices[i]){
                buy = Math.min(prices[i], buy);
            }
            profit = Math.max(prices[i] - buy, profit);
        }
        profit = Math.max(prices[prices.length - 1] - buy, profit);
        return profit;
    }
}