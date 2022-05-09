class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, s = 0;
        String tmp = "", ans = "";
        while(i >= 0 || j >= 0){
            if(i >= 0) s += num1.charAt(i--) - '0';
            if(j >= 0) s += num2.charAt(j--) - '0'; 
            tmp += s%10;
            s = s/10;
        }
        if(s != 0) tmp += s;
        for(i = tmp.length() - 1; i >= 0; i--) ans += tmp.charAt(i);
        return ans;
    }
}