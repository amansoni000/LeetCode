class Solution {
    public int helper(int n, int[][] dp){
        if(n == 0) return 0;
        if(n == 1) return 1;
        if(n == 2) return 2;
        if(dp[n-2][n-1] != 0) return dp[n-2][n-1];
        return dp[n-2][n-1] = helper(n-2, dp) + helper(n-1, dp);
    }
    public int climbStairs(int n) {
        int[][] dp = new int[n+1][n+1];
        return helper(n, dp);
    }
}