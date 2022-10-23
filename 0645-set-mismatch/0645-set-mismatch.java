class Solution {
    public int[] findErrorNums(int[] nums) {
        int sum = 0, og_sum = 0, n = nums.length, a = -1;
        int[] freq = new int[n+1];
        for(int x : nums){
            sum += x;
            if(freq[x] > 0) a = x;
            freq[x]++;
        }
        og_sum = (n*(n+1))/2;
        int b = og_sum - sum + a;
        int[] arr = {a, b};
        return arr;
    }
}