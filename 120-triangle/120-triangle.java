class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[] dp = new int[triangle.size() + 1];
        for(int i = triangle.size() - 1; i >= 0; i--){
            List<Integer> temp = triangle.get(i);
            for(int j = 0; j < temp.size(); j++){
                dp[j] = Math.min(dp[j], dp[j + 1]) + temp.get(j);
            }
        }
        return dp[0];
    }
}