class Solution {
    public int minOperations(String s) {
        if(s.length() == 1) return 0;
        
        int count1 = 0;
        int count0 = 0;
        return getCount(s, count1, count0);
                
        // System.out.println(getCountFor1 + "  " + getCountFor0);
        // return Math.min(countForForward, countForBack);
        
        
    }
    
    public int getCount(String s, int count1, int count0){
        char start = '0';
        char next = '1';
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(i % 2 == 0){
                if( s.charAt(i) != start ){
                    count0++;
                }
                else{
                    count1++;
                }
            }  
            else{
                if(s.charAt(i) != next){
                    count0++;
                }
                else{
                    count1++;
                }
            }
        }
        return Math.min(count1, count0);
        
    }
}