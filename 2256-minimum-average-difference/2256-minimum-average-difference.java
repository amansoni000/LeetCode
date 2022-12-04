class Solution {
    public int minimumAverageDifference(int[] nums) {
        long[] left = new long[nums.length];
        long[] right = new long[nums.length];
        long sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum += (long)nums[i];
            left[i] = sum;
        }
        sum = 0;
        for(int i = nums.length - 1; i >= 0; i--){
            right[i] = sum;
            sum += (long)nums[i];
        }
        long min = Integer.MAX_VALUE, ans = 0;
        for(int i = 0; i < nums.length-1; i++){
            long l = left[i]/(i+1);
            long r = right[i]/(nums.length-i-1);
            long abs = Math.abs(l - r);
            if(abs < min){
                ans = i;
                min = abs;
            }
        }
        long abs = Math.abs(left[nums.length-1]/nums.length);
        if(abs < min){
            ans = nums.length-1;
        }
        return (int)ans;
    }
}