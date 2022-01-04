class Solution {
    public int numPairsDivisibleBy60(int[] time) {
        int pairs = 0,mod =0;
        int n = time.length;
        int[] arr = new int[60];
        for(int i=0;i<n;i++){
            mod = time[i]%60;
            arr[mod]++;
        }
        for(int i=1;i<30;i++){
            pairs+=arr[i]*arr[60-i];
        }
        if(arr[0]>1){
            pairs+=arr[0]*(arr[0]-1)/2;
        }
        if(arr[30]>1){
            pairs+=arr[30]*(arr[30]-1)/2;
        }
        return pairs;
    }
}