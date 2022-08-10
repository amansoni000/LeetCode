class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while(!set.contains(n)){
            set.add(n);
            int sum = 0, x = n;
            while(x > 0){
                int rem = x%10;
                x = x/10;
                sum += rem*rem;
            }
            n = sum;
        }
        return n == 1;
    }
}