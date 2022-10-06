class Solution {
    public int findMin(int[] nums) {
        int l = 0, r = nums.length-1, ans = 0;
        while(l <= r){
            int mid = (l+r)/2;
            // System.out.println(nums[mid] + " " + l + " " + r);
            if(nums[mid] > nums[r]){
                l = mid+1;
            }
            else if(nums[mid] < nums[l]){
                r = mid;
                l++;
            }
            else{
                r--;
            }
        }
        return nums[l];
    }
}