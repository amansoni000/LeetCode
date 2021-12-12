class Solution {
    public int minimumDifference(int[] nums, int k) {
        int n=nums.length;
        Arrays.sort(nums);
        int mindiff = Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            int j=i+k-1;
            mindiff=Math.min(mindiff,nums[j]-nums[i]);
        }
        
        return mindiff;
    }
}