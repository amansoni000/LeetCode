class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1, ans = 0;
        while(l <= r){
            int mid = (l+r)/2;
            // System.out.println(nums[mid]);
            if(nums[mid] >= nums[0]){
                l = mid+1;
            }
            else{
                ans = mid;
                r = mid-1;
            }
        }
        return nums[ans];
    }
}