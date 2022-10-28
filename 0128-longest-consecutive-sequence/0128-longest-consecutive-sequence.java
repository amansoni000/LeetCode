class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        int ans = Integer.MIN_VALUE;
        for(int i : nums) set.add(i);
        for(int i : set){
            if(!set.contains(i - 1)){
                int temp = i;
                while(set.contains(temp)){
                    temp++;
                }
                ans = Math.max(temp - i, ans);
            }
        }
        return ans;
    }
}