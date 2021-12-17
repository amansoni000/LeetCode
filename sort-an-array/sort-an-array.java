class Solution {
    public void mergesort(int[] nums,int left,int right){
        if(left<right){
            int mid = (left+right)/2;
            mergesort(nums,left,mid);
            mergesort(nums,mid+1,right);
            merge(nums,left,mid,right);
        }
    }
    public void merge(int[] nums,int left,int mid,int right){
        int temp=0;
        int len1 = mid-left+1;
        int len2 = right-mid;
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        
        for(int i=0;i<len1;i++){
            arr1[i]=nums[left+i];
        }
        for(int i=0;i<len2;i++){
            arr2[i]=nums[mid+1+i];
        }
        int i=0,j=0,k=left;
        while(i<len1&&j<len2){
            if(arr1[i]>arr2[j]){
                nums[k]=arr2[j];
                j++;
            }
            else{
                nums[k]=arr1[i];
                i++;
            }
            k++;
        }
        while(i<len1){
            nums[k]=arr1[i];
            i++;
            k++;
        }
        while(j<len2){
            nums[k]=arr2[j];
            j++;
            k++;
        }
    }
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
}