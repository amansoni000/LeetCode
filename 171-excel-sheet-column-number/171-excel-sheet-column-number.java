class Solution {
    public int titleToNumber(String columnTitle) {
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for(int i=1; i<=s.length(); i++){
            map.put(s.charAt(i-1), i);
        }
        int value = 0, j=0;
        for(int i=0; i<columnTitle.length(); i++){
            double sum_pow = Math.pow(26, columnTitle.length() - i - 1);
            value += (int)sum_pow*map.get(columnTitle.charAt(i));
        }
        return value;
    }
}