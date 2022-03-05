class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums.length == 1) return nums[0];
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] arr = new int[10000 + 1];
        int maxNumber = 0;
        for(int i = nums.length-1; i >= 0; i--){
            arr[nums[i]] += nums[i];
        }
        int[] dp = new int[10000 + 3];
        int j=2;
        for(int i = arr.length-1 ;i >= 0; i--){
            dp[j] = Math.max(dp[j-2] + arr[i],dp[j-1]);
            j++;
        }
        return dp[10002];
    }
}