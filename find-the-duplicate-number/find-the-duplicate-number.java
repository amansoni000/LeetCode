class Solution {
    public int findDuplicate(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int dupli=0;
        int k = n-1;
        for(int i=0;i<n-1;i++){
            if(nums[i]==nums[i+1]){
                dupli = nums[i];
            }
        }
        return dupli;
    }
}