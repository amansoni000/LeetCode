class Solution {
    public int singleNumber(int[] nums) {
        // XOR 
        int result = 0, n = nums.length;
        for(int i=0; i<n; i++){
            result ^= nums[i];
        }
        return result;
    }
}