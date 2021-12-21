class Solution {
    public int countBinarySubstrings(String s) {
        int n=s.length();
        int count = 0;
        int same = 1;
        int old = 0;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==s.charAt(i-1)){
                same++;
            }
            else{
                count += Math.min(same,old);
                old = same;
                same = 1;
            }
        }
        return count + Math.min(same,old);
    }
}