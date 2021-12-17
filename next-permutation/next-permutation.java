class Solution {
    public void swap(int[] nums,int start,int end){
        int temp=0;
        temp=nums[start];
        nums[start]=nums[end];
        nums[end]=temp;
    }
    public void reverse(int[] arr,int start,int end){
        while(start<end){
            swap(arr,start,end);
            start++;
            end--;
        }
    }
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int ptr=-1;
        int temp=0;
        int nextmax=Integer.MAX_VALUE;
        for(int i=n-1;i>0;i--){
            if(nums[i]>nums[i-1]){
                ptr=i; 
                break;
            }
        }
        if(ptr==-1){
            reverse(nums,0,n-1);
        }
        else{
            int prev = ptr;
            for(int i=ptr+1;i<n;i++){
                 if(nums[i]>nums[ptr-1]&&nums[i]<=nums[prev]){
                     prev=i;
                 }
             }
            swap(nums,prev,ptr-1);
            reverse(nums,ptr,n-1);
        }
        
        
        
        
    }
}