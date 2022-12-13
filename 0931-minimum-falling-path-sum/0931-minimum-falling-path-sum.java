class Solution {
    public int solver(int[][] matrix, int i, int j, int[][] dp){
        int n = matrix.length, m = matrix[0].length;
        if(i >= n || j >= m || j < 0){
            return Integer.MAX_VALUE - 10000;
        }
        if(dp[i][j] != Integer.MIN_VALUE) return dp[i][j];
        if(i == n-1){
            return matrix[i][j];
        }
        int sum1 = matrix[i][j] + solver(matrix, i+1, j-1, dp);
        int sum2 = matrix[i][j] + solver(matrix, i+1, j, dp);
        int sum3 = matrix[i][j] + solver(matrix, i+1, j+1, dp);
        return dp[i][j] = Math.min(sum1, Math.min(sum2, sum3));
    }
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        int[][] dp = new int[n][m];
        int ans = Integer.MAX_VALUE - 10000;
        for(int[] arr : dp){
            Arrays.fill(arr, Integer.MIN_VALUE);
        }
        for(int j = 0; j < m; j++){
            int i = 0;
            int val = solver(matrix, i, j, dp);
            ans = Math.min(ans, val);
        }
        return ans;
    }
}