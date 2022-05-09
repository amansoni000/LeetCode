class Solution {
    public String addStrings(String num1, String num2) {
        int i = num1.length() - 1, j = num2.length() - 1, carry = 0, s = 0;
        String ans = "", ans1 = "";
        while(i >= 0 || j >= 0){
            s = 0;
            if(i >= 0) s += num1.charAt(i) - '0';
            if(j >= 0) s += num2.charAt(j) - '0'; 
            s += carry;
            carry = s/10;
            s = s%10;
            ans += s;
            i--;
            j--;
        }
        if(carry != 0) ans += carry;
        for(i = ans.length() - 1; i >= 0; i--) ans1 += ans.charAt(i);
        return ans1;
    }
}