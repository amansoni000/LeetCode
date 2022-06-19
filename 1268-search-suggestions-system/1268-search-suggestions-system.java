class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(String str : products){
            String temp = "";
            for(int i = 0; i < str.length(); i++){
                temp += str.charAt(i);
                List<String> list = map.getOrDefault(temp, new ArrayList<String>());
                list.add(str);
                map.put(temp, list);
            }
        }
        String temp = "";
        for(int i = 0; i < searchWord.length(); i++){
            temp += searchWord.charAt(i);
            List<String> list = map.getOrDefault(temp, new ArrayList<String>());
            Collections.sort(list);
            if(list.size() <= 3) ans.add(list);
            else{
                List<String> dummy = new ArrayList<>();
                for(int j = 0; j < 3; j++){
                    dummy.add(list.get(j));
                }
                ans.add(dummy);
            }
        }
        return ans;
    }
}