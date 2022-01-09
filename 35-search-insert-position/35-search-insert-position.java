class Solution {
    public int searchInsert(int[] nums, int target) {
        int start=0, end = nums.length-1, mid=0, ans=-1;
        while(start<=end){
            mid = (start+end)/2;
            if(nums[mid]>target){
                end = mid-1;
                ans = mid;
            }
            if(nums[mid]<target){ 
                start = mid+1;
                ans = mid+1;
            }
            if(nums[mid] == target) return mid;
        }
        // System.out.println(mid+1);
        return ans;
    }
}