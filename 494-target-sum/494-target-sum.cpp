class Solution {
    int sum = 0, ans = 0;
    public void helper(int i,int n, int target, int[] nums, int[] dp){
        if(i == n){
            if(target == 0) ans+=1;
            return;
        }
        helper(i+1, n, target + nums[i], nums, dp);
        helper(i+1, n, target - nums[i], nums, dp);
    }
    public int findTargetSumWays(int[] nums, int target) {
        int[] dp = new int[nums.length];
        helper(0, nums.length, target, nums, dp);
        return ans;
    }
}