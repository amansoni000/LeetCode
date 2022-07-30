class Solution {
    public int maxSubArray(int[] nums) {
        int max_sum = Integer.MIN_VALUE, curr_sum = 0, sum = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            curr_sum += nums[i];
            if(sum < curr_sum){
                sum = curr_sum;
            }
            if(curr_sum < 0){
                curr_sum = 0;
            }
            if(max_sum < sum){
                max_sum = sum;
            }
        }
        return max_sum;
    }
}