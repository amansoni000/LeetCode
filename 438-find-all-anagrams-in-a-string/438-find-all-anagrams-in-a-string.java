class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        ArrayList<Integer> ls = new ArrayList<Integer>();
        if(s.length() < p.length()) return ls;
        
        HashMap<Character,Integer> p_map = new HashMap<>();
        HashMap<Character,Integer> s_map = new HashMap<>();
        
        for(int i=0; i<p.length(); i++){
            p_map.put(p.charAt(i),p_map.getOrDefault(p.charAt(i),0)+1);
        }
        for(int i=0; i<s.length(); i++){
            char chr = s.charAt(i);
            s_map.put(chr,s_map.getOrDefault(chr,0)+1);
            
            if(i >= p.length()){
                char chr2 = s.charAt(i-p.length());
                if(s_map.get(chr2) == 1){
                    s_map.remove(chr2);
                }
                else{
                    s_map.put(chr2,s_map.get(chr2)-1);
                }
            }
            if(p_map.equals(s_map)) ls.add(i - p.length() + 1);
        }
        return ls;
    }
}
        