class Solution {
    public int numSquares(int amount) {
        int[] coins = new int[100];
        for(int i = 0; i < 100; i++){
            coins[i] = (i + 1) * (i + 1);
            //filling up coins[] to (100 * 100) since 10^4 is constraint
        }

        int[] dp = new int[amount + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        
        dp[0] = 0;
        for(int i = 1; i < dp.length; i++){
            for(int j = coins.length - 1; j >= 0; j--){
                if(i - (coins[j]) >= 0){
                     dp[i] = Math.min(dp[i], 1 + dp[i - coins[j]]);
                }
            }
        }

        return dp[amount];
    }
}