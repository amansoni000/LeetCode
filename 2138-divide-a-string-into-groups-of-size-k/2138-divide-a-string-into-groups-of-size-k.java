class Solution {
    public String[] divideString(String str, int k, char fill) {
        int remaining = str.length()%k, add=0, i=0, j=0 , start=0;
        if(remaining > 0) add = k-remaining;
        while(add-->0) str+=fill;
        String[] strarr = new String[str.length()/k];
        while( i<str.length() && j<str.length() && start<strarr.length){
            j=i+k;
            strarr[start] = str.substring(i,j);
            i=j;
            start++;
        }
        return strarr;
    }
}