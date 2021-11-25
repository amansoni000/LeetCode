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
        // for(int i=0;i<n;i++){
        //     if(lowest>prices[i]){
        //         lowest=prices[i];
        //         j=i;
        //     }
        // }
        // for(int i=j;i<n;i++){
        //     if(high<prices[i]){
        //         high=prices[i];
        //     }
        // }
        // System.out.print(j);
        // System.out.print(lowest);
        // System.out.print(high);
        // profit = high - lowest;
        return profit;
    }
}