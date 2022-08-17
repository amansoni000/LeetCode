class Solution {
    public int maxProfit(int[] prices) {
        int i = 0, n = prices.length, ans = 0, buy = 0, sell = 0;
        while(i < n-1){
            while(i < n-1 && prices[i+1] <= prices[i]){
                i++;
            }
            buy = prices[i];
            while(i < n-1 && prices[i+1] > prices[i]){
                i++;
            }
            sell = prices[i];
            ans += sell - buy;
        }
        return ans;
    }
}