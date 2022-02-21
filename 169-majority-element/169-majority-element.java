class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int count = 0, last = nums[0], count2 = 0, mazor = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == last) count++;
            else{
                if(count > count2){
                    mazor = last;
                    count2 = count;
                }
                count = 1;
                last = nums[i];
            } 
        }
        if(count > count2){
            mazor = last;
            count2 = count;
        }
        return mazor;
    }
}