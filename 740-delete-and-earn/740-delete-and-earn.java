class Solution {
    public int deleteAndEarn(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + num);
        }
        int[] dp = new int[10000 + 1];
        dp[1] = map.getOrDefault(1,0);
        for(int i = 2 ;i < dp.length; i++){
            int value = map.getOrDefault(i, 0);
            dp[i] = Math.max(dp[i-2] + value ,dp[i-1]);
        }
        return dp[10000];
    }
}