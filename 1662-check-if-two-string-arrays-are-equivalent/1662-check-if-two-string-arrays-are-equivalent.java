class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        
        String string1 = getString(word1);
        
        String string2 = getString(word2);
        
        return string1.equals(string2);
        
    }
    
    public String getString(String[] words){
        String result = "";
        
        for(int i = 0; i < words.length; i++){
            result += words[i];
        }
        
        return result;
    }
    
}