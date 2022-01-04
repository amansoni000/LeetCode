class Solution {
    public int bitwiseComplement(int n) {
        String s = Integer.toString(n,2);
        String s1 = "";
        String s3 = "";
        for(int i=0;i<s.length();i++){
            s1+='1';
        }
        for(int i=0;i<s.length();i++){
            if(s1.charAt(i)==s.charAt(i)){
                s3+='0';
            }
            else{
                s3+='1';
            }
        }
        int deci = Integer.parseInt(s3,2);
        return deci;
    }
}