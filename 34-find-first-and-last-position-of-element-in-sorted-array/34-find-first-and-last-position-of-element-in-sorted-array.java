class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[2];
        int start = 0, end = nums.length-1, mid;
        if(nums.length==0){
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        while(start<end){
            mid = (start+end)/2;
            if(nums[mid]>target){
                end = mid-1;
            }
            else if(nums[mid]<target){
                start = mid + 1;
            }
            else if(nums[mid] == target){
                while(nums[end]>target && end>mid){
                    end--;
                }
                while(nums[start]<target && start<mid){
                    start++;
                }
                break;
            }
        }
        if(nums[start]!=target){
            res[0] = -1;
            res[1] = -1;
            return res;
        }
        res[0] = start;
        res[1] = end;
        return res;
    }
}