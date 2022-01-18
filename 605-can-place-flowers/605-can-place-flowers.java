class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int len = flowerbed.length, start = 0;
        int[] arr =  new int[len+2];
        arr[0] = 0;
        arr[arr.length-1] = 0;
        for(int i=1;start<len;i++){
            arr[i] = flowerbed[start];
            start++;
        }
        for(int i=1;i<arr.length-1;i++){
            if(arr[i-1]==0 && arr[i]==0 && arr[i+1]==0){
                arr[i]=1;
                n--;
            } 
        }
        if(n<=0) return true;
        else return false;
    }
}