class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        ls.add(new  ArrayList<>());
        for(int i=0; i<nums.length; i++){
            for(int j=0; j<ls.size(); j++){
                List<Integer> x = new ArrayList<>(ls.get(j));
                x.add(nums[i]);
                if(x.size() > 1 && x.get(0) == x.get(1)) break;
                ls.add(x);
            }
        }
        return ls;
    }
}