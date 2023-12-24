class Solution {
    public int minOperations(String s) {
        if(s.length() == 1) return 0;
        
        int countForForward = getCountFor1(s);
        
        int countForBack = getCountFor0(s);
        
        // System.out.println(getCountFor1 + "  " + getCountFor0);
        return Math.min(countForForward, countForBack);
        
        
    }
    
    public int getCountFor1(String s){
        char start = '0';
        char next = '1';
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                if( s.charAt(i) != start ){
                    count++;
                }
            }  
            else{
                if(s.charAt(i) != next){
                    count++;
                }
            }
        }
        return count;
        
    }
    
    public int getCountFor0(String s){
        char start = '1';
        char next = '0';
        int count = 0;
        
        
        for(int i = s.length() - 1; i >= 0; i--){
            if(i % 2 == 0){
                if( s.charAt(i) != start ){
                    count++;
                }
            }  
            else{
                if(s.charAt(i) != next){
                    count++;
                }
            }
        }
        return count;
        
    }
}