class Solution {
    public void reverse(int[] nums, int l, int h){
        while(l < h){
            int temp = nums[l];
            nums[l] = nums[h];
            nums[h] = temp;
            l++;
            h--;
        }
        return;
    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ls = new ArrayList<>();
        Arrays.sort(nums);
        ls.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
        int idx = 0;
        while(true){
            idx = 0;
            for(int i = nums.length - 1; i > 0; i--){
                if(nums[i - 1] < nums[i]){
                   idx = i;
                   break;
                }
            }
            if(idx == 0)  break;
            else{
                int j = nums.length - 1;
                while(j >= 0 && nums[j] <= nums[idx - 1])  j--;
                int temp = nums[idx - 1];
                nums[idx - 1] = nums[j];
                nums[j] = temp;
                reverse(nums, idx, nums.length - 1);
                ls.add(Arrays.stream(nums).boxed().collect(Collectors.toList()));
            }
        }
        return ls;
    }
}