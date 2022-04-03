class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> list = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == key) list.add(i);
        }
        for(int i = 0; i < list.size(); i++){
            int idx = list.get(i);
            for(int j = 0; j < nums.length; j++){
                if(Math.abs(j - idx) <= k) arr[j] = 1;
            }
        }
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 1) ans.add(i);
        }
        return ans;
    }
}