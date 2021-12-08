class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        int n = nums.length;
        int curr=nums[0];
        for(int i=0;i<n;i++){
            curr = Math.abs(nums[i]);
            if(nums[curr-1]<0){
                ls.add(curr);
            }
            nums[curr-1]*=-1;
        }
        return ls;
        
    }
}