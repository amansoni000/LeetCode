class Solution {
    public int helper(List<List<Integer>> triangle, int i, int j, int index, int[][] dp){
        if(i == j){
            return 0;
        }
        List<Integer> temp = triangle.get(i);
        if(dp[i][index] != -1) return dp[i][index];
        return dp[i][index] = Math.min(temp.get(index) + helper(triangle, i+1, j, index, dp),
                             temp.get(index) + helper(triangle, i+1, j, index + 1, dp));
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int min = Integer.MAX_VALUE;
        int dp[][] = new int[triangle.size() + 1][triangle.size() + 1];
        for(int[] i:dp){
            Arrays.fill(i, -1);
        }
        return helper(triangle, 0, triangle.size(), 0, dp);
    }
}