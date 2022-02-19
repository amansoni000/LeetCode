class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        Set<List<Integer>> hs = new HashSet<>();
        hs.add(new ArrayList<>());
        for(int i=0; i<nums.length; i++){
            Set<List<Integer>> hs1 = new HashSet<>();
            for(List<Integer> list:hs){
                List<Integer> x = new ArrayList<>(list);
                x.add(nums[i]);
                hs1.add(x);
            }
            for(List<Integer> list:hs1){
                List<Integer> x = new ArrayList<>(list);
                Collections.sort(x);
                hs.add(x);
            }
        }
        for(List<Integer> list:hs){
            List<Integer> x = new ArrayList<>(list);
            ls.add(x);
        }
        return ls;
    }
}