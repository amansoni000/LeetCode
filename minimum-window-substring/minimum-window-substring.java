class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length()){
            return "";
        }
        if(s.equals(t)){
            return s;
        }
        if(s.length()==0 || t.length()==0){
            return "";
        }
        int len_t = t.length();
        int len_s = s.length();
        int j = 0,min = Integer.MAX_VALUE,count = 0;
        HashMap<Character,Integer> hs1 = new HashMap<>();
        HashMap<Character,Integer> hs2 = new HashMap<>();
        for(int i=0; i<len_t; i++)
        {
            hs1.put(t.charAt(i), hs1.getOrDefault(t.charAt(i), 0) + 1);
        }
        // String res = "";
        int res=0;
        int len = hs1.size();
        for(int i=0;i<len_s;i++)
        {
            char ch1 = s.charAt(i);
            if(!hs1.containsKey(ch1))
            {
                continue;
            }
            hs1.put(s.charAt(i), hs1.getOrDefault(s.charAt(i), 0) - 1);
            if(hs1.get(ch1)==0)
            {
                count++;
            }
            while(count==len)
            {
                char ch2 = s.charAt(j);
                if(min>i-j+1)
                {
                    min = i-j+1;
                    res = j;
                }
                if(hs1.containsKey(ch2))
                {
                    hs1.put(ch2,hs1.get(ch2)+1);
                    if(hs1.get(ch2)==1)
                    {
                        count--;
                    }
                }
                j++;
                
            }
            
        }
        if(min>s.length()){
            return "";
        }
        return s.substring(res,min+res);
    }
}