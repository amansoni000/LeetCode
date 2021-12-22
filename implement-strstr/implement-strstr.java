class Solution {
    public int strStr(String haystack, String needle) {
        int j;
        char[] haystackarr = haystack.toCharArray();
        char[] needlearr = needle.toCharArray();
        int l1 = haystackarr.length;
        int l2 = needlearr.length;
        if(needle.length()==0){
            return 0;
        }
        if(l1<l2){
            return -1;
        }
        for (int i = 0;i<l1-l2+1; i++) {
            for (j = 0;j<l2; j++) {
                if (haystackarr[i + j] != needlearr[j]) {
                    break;
                }
            }
            if (j==l2) {
                return i;
            }
        }
        return -1;
    }
}