class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length() != word2.length()) return false;
        boolean ans = true;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        
        for(int i = 0; i < word1.length(); i++){
            map1.put(word1.charAt(i), map1.getOrDefault(word1.charAt(i), 0) + 1);
        }
        
        for(int i = 0; i < word2.length(); i++){
            map2.put(word2.charAt(i), map2.getOrDefault(word2.charAt(i), 0) + 1);
        }
        
        if(map1.equals(map2)) return true;
        
        for(Map.Entry<Character, Integer> entry : map1.entrySet()){
            if(!map2.containsKey(entry.getKey())) return false;
        }
        
        ArrayList<Integer> list1 = new ArrayList<>(map1.values());
        ArrayList<Integer> list2 = new ArrayList<>(map2.values());
        
        Collections.sort(list1);
        Collections.sort(list2);
        if(list1.equals(list2)) return true;
        return false;
    }
}