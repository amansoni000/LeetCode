class Solution {
    public int findKthLargest(int[] nums, int k) {
        int l,start,end;
        l = nums.length;
        start = 0;
        end = l-1;
        quickshort(nums,start,end);
        k = l-k;
        for(int i = 0; i < l;i++)
            System.out.print(nums[i] + " ");
            System.out.println();
        return nums[k];
    }
    public static void swap(int[] nums,int n_j,int pivott){
        int temp;
        temp=nums[n_j];
        nums[n_j]=nums[pivott];
        nums[pivott]=temp;
    }
    public static void quickshort(int[] nums,int start,int end){
        if(start<end){
            int pivot;
            pivot = partition(nums,start,end);
            quickshort(nums,start,pivot-1);
            quickshort(nums,pivot+1,end);
        }
    }
    public static int partition(int[] nums,int start,int end){
        int i;
        int pivot_new;
        pivot_new = nums[end];
        i=start-1;
        for(int j=start;j<=end-1;j++){
            if(nums[j]<pivot_new){
                i++;
                swap(nums,i,j);
                    
            }
        }
        swap(nums, i + 1, end);
    return (i + 1);
        
    }
}