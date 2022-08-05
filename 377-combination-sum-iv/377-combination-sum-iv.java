class Solution {
    int count = 0;
    public int helper(int[] nums, int target, int curr_sum, int[] dp){
        if(curr_sum == target){
            return 1;
        }
        if(curr_sum > target){
            return 0;
        }
        if(dp[curr_sum] != -1) return dp[curr_sum];
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans += helper(nums, target, curr_sum + nums[i], dp);
        }
        return dp[curr_sum] = ans;
    }
    public int combinationSum4(int[] nums, int target) {
        int[] dp = new int[target+1];
        Arrays.fill(dp, -1);
        int ans = helper(nums, target, 0, dp);
        return ans;
    }
}