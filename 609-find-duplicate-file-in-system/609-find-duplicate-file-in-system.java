class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> ans = new ArrayList<>();
        for(int i = 0; i < paths.length; i++){
            String str = paths[i];
            String path = "";
            int j = 0;
            for(j = 0; j < str.length(); j++){
                if(str.charAt(j) == ' ') break;
                else path += str.charAt(j);
            }
            j++;
            String filename = "";
            String content = "";
            Boolean co = false, file = true;
            while(j < str.length()){
                if(str.charAt(j) == ')'){
                    List<String> list = map.getOrDefault(content, new ArrayList<>());
                    list.add(path + "/" + filename);
                    map.put(content, list);
                    filename = "";
                    content = "";
                    co = false;
                    file = true;
                    j++;
                }
                else if(str.charAt(j) == '('){
                    co = true;
                    file = false;
                }
                else if(file){
                    filename += str.charAt(j);
                }
                else if(co){
                    content += str.charAt(j);
                }
                j++;
            }
        }
        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            if(entry.getValue().size() > 1) ans.add(entry.getValue());
        }
        // System.out.println(map);
        return ans;
    }
}