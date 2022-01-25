class Solution {
    public boolean validMountainArray(int[] arr) {
        int j=-1, m=arr.length+1;
        boolean res;
        if(arr.length < 3) return false;
        
        else{
            for(int i=1; i<arr.length; i++){
                if(arr[i] > arr[i-1] && i<m) j=i;
                
                else if( arr[i] < arr[i-1] && i>j) m=i;
                
                else return false;
            }
        }
        res = (j==-1 || m==arr.length+1) ? false :  true ;
        return res;
    }
}