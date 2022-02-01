class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1, max = 100000, k=0;
        for(int i=0; i<nums.length-1; i++){
            int num = nums[i];
            count = 1;
            while(i<nums.length-1 && nums[i+1] == num ){
                if(count-- > 0){
                    i++;
                }
                else{
                    nums[i+1] = max;
                    i++;
                }
            }
        }
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++){
            if(nums[i] == max) break;
            k++;
        }
        return k;
    }
}