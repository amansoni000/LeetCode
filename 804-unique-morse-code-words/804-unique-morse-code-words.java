class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        List<String> ls =  Arrays.asList(".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--..");
        HashSet<String> set = new HashSet<>();
        for(String s : words){
            String str = "";
            for(char ch : s.toCharArray()){
                str += ls.get(ch - 'a');
            }
            set.add(str);
        }
        return set.size();
    }
}