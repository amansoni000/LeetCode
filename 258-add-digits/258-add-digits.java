class Solution {
    public int recur(int num){
        int temp = 0;
        if(num >= 10){
            do{
                temp += num%10;
                num = num/10;
            }while(num != 0);
            return recur(temp);
        }
        else return num;
    }
    public int addDigits(int num) {
        return recur(num);
    }
}