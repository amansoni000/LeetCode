class Solution {
    public int firstMissingPositive(int[] nums) {
         // done in O(nlogn)
        Arrays.sort(nums);
        int itr = 1, ans = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(nums[i] == nums[i + 1]) nums[i] = -1;
        }
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                if(nums[i] != itr){
                    ans = itr;
                    break;
                }
                itr++;
            }
        }
        if(nums[nums.length - 1] < 0) ans = 1;
        if(ans == 0) ans = nums[nums.length - 1] + 1;
        return ans;
    }
}