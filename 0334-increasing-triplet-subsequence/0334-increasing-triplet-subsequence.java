class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE, mid = Integer.MAX_VALUE, last = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] <= first){
                first = nums[i];
            }
            else if(nums[i] <= mid && nums[i] > first){
                mid = nums[i];
            }
            else{
                last = nums[i];
                // System.out.println(first + " " + mid + " " + last);
                return true;
            }
        }
        return false;
    }
}