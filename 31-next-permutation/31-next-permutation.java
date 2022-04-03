class Solution {
    public void swap(int[] nums, int ptr1, int ptr2){
        int temp = nums[ptr1];
        nums[ptr1] = nums[ptr2];
        nums[ptr2] = temp;
    }
    public void nextPermutation(int[] nums){
        int len = nums.length, idx = 0;
        for(int i = len - 1; i > 0; i--){
            if(nums[i-1] < nums[i]){
                idx = i;
                break;
            }
        }
        Arrays.sort(nums, idx, len);
        if(idx != 0){
            for(int i = idx; i < len; i++){
                if(nums[i] > nums[idx - 1]){
                    swap(nums, idx - 1, i);
                    break;
                }
            }
        }
        Arrays.sort(nums, idx, len);
    }
}