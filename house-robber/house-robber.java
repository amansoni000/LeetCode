class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        int[] dp = new int[nums.length+2];
        int j=2;
        for(int i=n-1;i>=0;i--){
            dp[j] = Math.max(dp[j-2] + nums[i],dp[j-1]);
            j++;
        }
        return dp[n+1];
    }
}