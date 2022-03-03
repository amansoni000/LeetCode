class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length < 3) return 0;
        int[] dp = new int[nums.length + 1];
        int count = 1, j=0, i=1, ans = 0, diff  = nums[1] - nums[0];
        while(i<nums.length){
            if(nums[i] - nums[i-1] == diff){
                count++;
                i++;
            }
            else{
                diff = nums[i] - nums[i-1];
                if(count >= 3){
                    dp[j++] = count;
                }
                count = 1;
            }
        }
        if(count >= 3){
            dp[j++] = count;
        }
        count = 1;
        for(i=0; i<dp.length; i++){
            if(dp[i] != 0){
                ans += ((dp[i] - 2)*(dp[i]-1))/2;
            }
        }
        // for(i=0; i<dp.length; i++){
        //     System.out.print(dp[i] +" ");
        // }
        return ans;
    }
}