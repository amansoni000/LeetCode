class Solution {
    public String frequencySort(String s) {
        
        Map<Character, Integer> m = new HashMap<>();
        for(char c: s.toCharArray()) m.put(c, m.getOrDefault(c,0)+1);

        List<Character> l = new ArrayList<>(m.keySet());
        Collections.sort(l , (a,b) -> (m.get(b)-m.get(a)));

        String ans="";

        for(int i = 0; i<l.size(); i++)
        {
            char c = l.get(i);
            for(int j=0;j<m.get(c); j++)
                ans+=c;
        }
        return ans;
    }

}