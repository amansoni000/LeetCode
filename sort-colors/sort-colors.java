class Solution {
    public void sortColors(int[] nums) {
        int l,count_0=0,count_1=0,count_2=0;
        l = nums.length;
        for(int i:nums){
            if(i==0){
                count_0++;
            }
            else if(i==1){
                count_1++;
            }
            else if(i==2){
                count_2++;
            }
            
        }
        for(int i=0;i<count_0;i++){
            nums[i]=0;
        }
        for(int i=count_0;i<count_1+count_0;i++){
            nums[i]=1;
        }
        for(int i=count_1+count_0;i<l;i++){
            nums[i]=2;
        }

    }
}