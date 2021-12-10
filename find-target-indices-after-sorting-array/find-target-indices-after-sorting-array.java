class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int n=nums.length;
        Arrays.sort(nums);
        ArrayList<Integer> ls = new ArrayList<Integer>();
        for(int i=0;i<n;i++){
            if(nums[i]==target){
                ls.add(i);
            }
        }
        return ls;
        
    }
}