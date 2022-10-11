class Solution {
    public int reinitializePermutation(int n) {
        if (n == 2) {
            return 1;
        }
        
        int ans = 1;
        
        int index_of_1 = 2;
        
        while (index_of_1 != 1) {
            index_of_1 = (index_of_1 * 2) % (n - 1);
            ++ans; 
        }
        
        return ans;
    }
}