class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n= nums.length;
        int idx1=-1,idx2=-1;
        int[] arr = new int[2];
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<n;i++){
            if(hm.containsKey(target-nums[i])){
                idx1 = hm.get(target-nums[i]);
                idx2 = i;
                break;
            }
            else{
                hm.put(nums[i],i);
            }
        }
        arr[0] = idx1+1;
        arr[1] = idx2+1;
        return arr;
    }
}