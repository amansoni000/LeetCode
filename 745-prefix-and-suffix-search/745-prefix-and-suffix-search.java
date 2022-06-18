class WordFilter {
    HashMap<String, Integer> map = new HashMap<>();
    public String all(String s, int i, int j,int index, HashMap<String, String> dp_map){
        if(i >= s.length() || j < 0) return "";
        
        if(dp_map.containsKey(i +"#" + j)){
            return dp_map.get(i+"#"+j);
        }
        
        String preff = all(s, i+1, j, index, dp_map);
        String suff = all(s, i, j-1, index, dp_map);
        map.put(preff, index);
        map.put(suff, index);
        
        dp_map.put(i+"#"+j, s.substring(0,i+1) + "#" +s.substring(j, s.length()));
        
        return s.substring(0,i+1) + "#" + s.substring(j, s.length());
    }
    public WordFilter(String[] words) {
        for(int j = 0; j < words.length; j++){
            HashMap<String, String> dp_map = new HashMap<>();
            if(j < words.length - 1 && words[j].equals(words[j+1])) continue;
            all(words[j], -1, words[j].length(), j, dp_map);
        }
    }
    
    public int f(String prefix, String suffix) {
        if(map.containsKey(prefix + "#" + suffix)){
            return map.get(prefix + "#" + suffix);
        }
        else return -1;
    }
}

/**
 * Your WordFilter object will be instantiated and called as such:
 * WordFilter obj = new WordFilter(words);
 * int param_1 = obj.f(prefix,suffix);
 */