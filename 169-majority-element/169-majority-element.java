class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int x = 0;
        for(int i : nums){
            if(count == 0){
                x=i;
            }
            if(i == x){
                count++;
            }else{
                count--;
            }
        }
        return x;
    }
}