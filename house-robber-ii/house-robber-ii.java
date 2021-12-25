class Solution {
    public int rob(int[] nums) {
        int n= nums.length;
        int[] dp = new int[nums.length+2];
        int j=2;
        if(nums.length==1){
            return nums[0];
        }
        for(int i=n-1;i>=0;i--){
            dp[j] = Math.max(dp[j-2] + nums[i],dp[j-1]);
            j++;
        }
        int k1 = dp[n];
        j=2;
        for(int i=n-2;i>=0;i--){
            dp[j] = Math.max(dp[j-2] + nums[i],dp[j-1]);
            j++;
        }
        int k2 = dp[n];
        return Math.max(k1,k2);
    }
}
