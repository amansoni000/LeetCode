class Solution {
    public int romanToInt(String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        S += 'I';
        int ans = 0;
        for(int i = 0; i < S.length() - 1; i++){
            if(map.get(S.charAt(i)) < map.get(S.charAt(i+1))){
                ans -= map.get(S.charAt(i));
            }
            else{
                ans += map.get(S.charAt(i));
            }
        }
        return ans;
    }
}