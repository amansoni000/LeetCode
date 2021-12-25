class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        int[] arr = new int[n+1];
        if(digits[n-1]!=9){
            digits[n-1] = digits[n-1] + 1;
            return digits;
        }
        else{
            for(int i=n-1;i>=0;i--){
                if(digits[i]==9){
                    digits[i] = 0;
                }
                else{
                    digits[i]+=1;
                    return digits;
                }
            }
            if(digits[0]==0){
                arr[0] = 1;
                return arr;
            }
        }
        return digits;
    }
}