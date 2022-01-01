class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> hs = new HashMap<>();
        List<List<String>> ls = new ArrayList<>();
        ArrayList<String> order=new ArrayList<>();
        for(int i=0;i<strs.length;i++){
            char[] arr = new char[strs[i].length()];
            arr = strs[i].toCharArray();
            Arrays.sort(arr);
            String s = new String(arr);
            List<String> list = new ArrayList<>();
            if(hs.containsKey(s)){
                list = hs.get(s);
                list.add(strs[i]);
                hs.put(s,list);
            }
            else{
                order.add(s);
                list.add(strs[i]);
                hs.put(s,list);
            }
            
        }
        for(String s:order){
            ls.add(hs.get(s));
        }
        return ls;
    }
}