class Solution {
    public int numberOfSteps(int num) {
        if(num == 0) return 0;
        int ans = 0;
        while(num > 1){
            if(num%2 == 0){
                ans+=1;
                num/=2;
            }
            else{
                num -=1;
                ans += 1;
            }
        }
        return ans + 1;
    }
}