class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k=n;
        for(int i=1;i<n;i++){
            if(nums[i]==nums[i-1]){
                nums[i-1] = 101;
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<n;i++){
            if(nums[i] == 101){
                k=i;
                break;
            }
        }
        return k;
    }
}