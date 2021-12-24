class Solution {
    public String longestPrefix(String s) {
        int i=1;
        int len=0;
        int n = s.length();
        int[] arr = new int[n];
        while(i<n){
            if(s.charAt(i)==s.charAt(len)){
                arr[i]=len+1;
                len++;
                i++;
            }
            else if(len==0){
                i++;
            }
            else{
                len = arr[len-1];
            }
        }
        int l=arr[n-1]; 
        return s.substring(0,l);
    }
}