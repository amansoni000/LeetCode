class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int start = -1,  end = -1, j = 0, max = -9999;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] <= nums[i + 1]){
                
            }
            else if(nums[i] > nums[i+1] && start == -1){
                for(j = i; j >=0; j--){
                    max = Math.max(max, nums[j]);
                    if(nums[j] <= nums[i+1]) break;
                }
                start = j + 1;
                end = i + 1;
            }
            else if(nums[i] > nums[i + 1] && start != -1){
                for(j = i; j >=0; j--){
                    max = Math.max(max, nums[j]);
                    if(nums[j] <= nums[i+1]) break;
                }
                if(j + 1 < start) start = j + 1;
                end = i + 1;
            }
            if(nums[i] < max) end = i;
        }
        if(nums[nums.length - 1] < max) end = nums.length - 1;
        if(start == -1 && end == -1) return 0;
        return end - start + 1;
    }
}