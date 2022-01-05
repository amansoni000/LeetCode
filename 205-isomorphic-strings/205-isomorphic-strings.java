class Solution {
    public boolean isIsomorphic(String s, String t) {
        int n= s.length();
        HashMap<Character,Character> hs = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            char chr_s = s.charAt(i);
            char chr_t = t.charAt(i);
            if(hs.containsKey(chr_s) && hs.get(chr_s)!=chr_t){
                return false;
            }
            if(!hs.containsKey(chr_s) && set.contains(chr_t)){
                return false;
            }
            hs.put(chr_s,chr_t);
            set.add(chr_t);
        }
        return true;
    }
}