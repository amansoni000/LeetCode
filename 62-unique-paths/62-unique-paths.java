class Solution {
    public int helper(int i, int j, int m, int n, int[][] dp){
        if(i == m && j == n) return 1;
        if(dp[i][j] != 0) return dp[i][j];
        if(i == m) return helper(i, j+1, m, n, dp);
        if(j == n) return helper(i+1, j, m, n, dp);
        return dp[i][j] =  helper(i, j+1, m, n, dp) + helper(i+1, j, m, n, dp);
    }
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m+1][n+1];
        return helper(0, 0, m-1, n-1, dp);
    }
}