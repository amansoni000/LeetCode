class Solution {
    Boolean[][] dp;
    public boolean helper(int[] nums, int idx, int sum){
        if(sum == 0) return true;
        if(idx >= nums.length || sum < 0) return false;
        if(dp[idx][sum] != null) return dp[idx][sum];
        
        return dp[idx][sum] = helper(nums, idx+1, sum - nums[idx]) || helper(nums, idx+1, sum);
    }
    public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums) sum += i;
        if(sum%2 != 0) return false;
        dp = new Boolean[nums.length+1][sum+1];
        for(Boolean[] arr : dp){
            Arrays.fill(arr, null);
        }
        sum /= 2;
        return helper(nums, 0, sum);
    }
}