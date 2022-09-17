class Solution {
    public int solver(int[][] matrix, int i, int j, int[][] dp){
        int n = matrix.length, m = matrix[0].length;
        if(i >= n || j >= m || j < 0){
            return Integer.MAX_VALUE - 10000;
        }
        if(i == n-1 && j == m-1){
            return matrix[i][j];
        }
        if(dp[i][j] != Integer.MIN_VALUE) return dp[i][j];
        int sum1 = matrix[i][j] + solver(matrix, i, j+1, dp);
        int sum2 = matrix[i][j] + solver(matrix, i+1, j, dp);
        return dp[i][j] = Math.min(sum1, sum2);
    }
    public int minPathSum(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int[][] dp = new int[n][m];
        for(int[] arr : dp){
            Arrays.fill(arr, Integer.MIN_VALUE);
        }
        return solver(grid, 0, 0, dp);
    }
}