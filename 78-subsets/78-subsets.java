class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        ls.add(new  ArrayList<>());
        for(int i=0; i<nums.length; i++){
            int len = ls.size();
            for(int j=0; j<len; j++){
                List<Integer> x = new ArrayList<>(ls.get(j));
                x.add(nums[i]);
                ls.add(x);
            }
        }
        return ls;
    }
}