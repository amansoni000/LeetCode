class Solution {
    public int helper(int i, int j, int m, int n, int[][] dp, int[][]ob){
        if(i == m - 1 && j == n - 1 && ob[i][j] != 1) return 1;
        if(i > m - 1 || j > n - 1 || ob[i][j] == 1) return 0;
        if(dp[i][j] != 0) return dp[i][j];
        else if(i >= m - 1) return helper(i, j+1, m, n, dp, ob);
        else if(j >= n - 1) return helper(i + 1, j, m, n, dp, ob);
        else return dp[i][j] = helper(i, j+1, m, n, dp, ob) + helper(i + 1, j, m, n, dp, ob);
    }
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length, n = obstacleGrid[0].length;
        int[][] dp = new int[m + 1][n + 1];
        return helper(0, 0, m, n, dp, obstacleGrid);
    }
}