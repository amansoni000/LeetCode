class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, diff = 0;
        for(int i=0; i<prices.length-1; i++){
            if(prices[i+1] - prices[i] > 0){
                min = Math.min(min,prices[i]);
                max = prices[i+1];
                diff = Math.max(diff,(max-min));
            }
        }
        return diff;
    }
}