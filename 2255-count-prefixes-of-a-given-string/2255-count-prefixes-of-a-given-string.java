class Solution {
    public int countPrefixes(String[] words, String s) {
        HashSet<String> set = new HashSet<>();
        String str = "";
        int ans = 0;
        for(int i = 0; i < s.length(); i++){
            str += s.charAt(i);
            set.add(str);
        }
        for(String x : words){
            if(set.contains(x)) ans++;
        }
        return ans;
    }
}