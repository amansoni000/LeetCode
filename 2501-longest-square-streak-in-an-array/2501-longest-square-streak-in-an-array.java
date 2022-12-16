class Solution {
    public int longestSquareStreak(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length, max = Integer.MIN_VALUE; 
        HashSet<Integer> set = new HashSet<>();
        for(int x : nums) set.add(x);
        
        for(int x : nums){
            int count = 1;
            int sqr = (int)Math.pow(x,2);
            while(set.contains(sqr)){
                count++;
                sqr = (int)Math.pow(sqr,2);
            }
            max = Math.max(count, max);
        }
        return max == 1 ? -1 : max;
    }
}