class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int idx1=-1,idx2=-1;
        int start=0, end=n-1;
        int[] arr = new int[2];
        while(start<end){
            int sum = nums[start] + nums[end];
            if(sum == target){
                idx1 = start+1;
                idx2 = end+1;
                break;
            }
            else if(sum>target) end--;
            else start++;
        }
        arr[0] = idx1;
        arr[1] = idx2;
        return arr;
    }
}