class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        // [1,5,4,2,9,9,9],
        HashSet<Integer> set = new HashSet<>();
        int i = 0, j = 0;
        long curr_sum = 0, max_sum = 0;
        while(i < nums.length && j < nums.length){
            if(set.contains(nums[j]) || (j - i + 1) > k){
                set.remove(nums[i]);
                curr_sum -= (long)nums[i];
                i++;
            }
            else{
                set.add(nums[j]);
                curr_sum += (long)nums[j];
                j++;
            }
            if(j-i+1 > k){
                max_sum = Math.max(max_sum, curr_sum);
            }
        }
        return max_sum;
    }
}