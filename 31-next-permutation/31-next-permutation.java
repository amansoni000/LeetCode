class Solution {
    public void swap(int[] nums, int ptr1, int ptr2){
        int temp = nums[ptr1];
        nums[ptr1] = nums[ptr2];
        nums[ptr2] = temp;
    }
    public void reverse(int[] nums, int start, int end){
        while(start < end){
            swap(nums, start++, end--);
        }
    }
    public void nextPermutation(int[] nums){
        int len = nums.length, idx = 0;
        for(int i = len - 1; i > 0; i--){
            if(nums[i-1] < nums[i]){
                idx = i;
                break;
            }
        }
        if(idx == 0){
            reverse(nums, idx, len - 1);
            return;
        }
        int j = len - 1;
        while( j >= 0 && nums[j] <= nums[idx - 1]){
            j--;
        }
        swap(nums, idx - 1, j);
        reverse(nums, idx, len - 1);
    }
}