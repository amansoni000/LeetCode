class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        ls.add(new  ArrayList<>());
        for(int i=0; i<nums.length; i++){
            List<List<Integer>> ls1 = new ArrayList<>();
            for(int j=0; j<ls.size(); j++){
                List<Integer> x = new ArrayList<>(ls.get(j));
                x.add(nums[i]);
                ls1.add(x);
            }
            for(int j=0; j<ls1.size(); j++){
                List<Integer> x = new ArrayList<>(ls1.get(j));
                Collections.sort(x);
                if(!ls.contains(x)) ls.add(x);
            }
        }
        return ls;
    }
}