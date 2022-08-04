class Solution {
    public int mirrorReflection(int p, int q) {
        int[][] arr = new int[p][p];
        while(p%2 == 0 && q%2 == 0){
            p/=2;
            q/=2;
        }
        if(p%2 == 0 && q != 0) return 2;
        else if(p%2 != 0 && q%2 != 0) return 1;
        else return 0;
    }
}