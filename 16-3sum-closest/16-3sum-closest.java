class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int n = nums.length;
        int mini = Integer.MAX_VALUE;
        int mid,end,diff,sum,res=-1;
        int new_diff=Integer.MAX_VALUE;
        for(int start=0;start<n-2;start++){
            mid=start+1;
            end=n-1;
            while(mid<end){
                sum = nums[start]+nums[mid]+nums[end];
                diff = Math.abs(target - sum);
                if(diff<mini){
                    new_diff = diff;
                    res = sum;
                }
                if(sum>target)
                    end--;
                else{
                    mid++;
                }
                mini = new_diff;
                
            }
            if(mini==0){
                break;
            }
        }
        return res;
    }
}