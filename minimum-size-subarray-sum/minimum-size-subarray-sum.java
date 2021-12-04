class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n=nums.length;
        int total=0;
        int count=0;
        int start=0;
        int finalans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            total+=nums[i];
            count++;
            while(total>=target){
                finalans=Math.min(finalans,count-start);
                total-=nums[start];
                start++;
            }
        }
        if(finalans==Integer.MAX_VALUE){
            finalans=0;
        }
        return finalans;
    }
}