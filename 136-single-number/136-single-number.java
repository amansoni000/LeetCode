class Solution {
    public int singleNumber(int[] nums) {
        // XOR 
        int sum=0, n=nums.length;
        for(int i=0;i<n;i++){
            sum ^= nums[i];
        }
        return sum;
    }
}