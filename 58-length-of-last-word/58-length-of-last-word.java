class Solution {
    public int lengthOfLastWord(String s) {
        int len = s.length(),count=0, space = 0,i=0;
        for(i=len-1;i>=0;i--){
            if(s.charAt(i)!=' ') space=1;
            if(s.charAt(i)==' ' && space==0) len = i;
            if(s.charAt(i)==' ' && space==1) break;
        }
        return s.substring(i+1,len).length();
    }
}