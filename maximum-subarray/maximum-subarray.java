class Solution {
    public int maxSubArray(int[] nums) {
        int max_so_far=Integer.MIN_VALUE;
        int max_end=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
            max_end = max_end + nums[i];
            if(max_end < nums[i]){
                max_end = nums[i];
            }
            if(max_so_far<max_end){
                max_so_far = max_end;
            }
        }
        return max_so_far;
        
    }
}