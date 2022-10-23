class Solution {
    public int[] findErrorNums(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int sum = 0, og_sum = 0, n = nums.length, a = -1;
        for(int x : nums){
            sum += x;
            if(set.contains(x)) a = x;
            set.add(x);
        }
        og_sum = (n*(n+1))/2;
        int b = og_sum - sum + a;
        int[] arr = {a, b};
        return arr;
    }
}