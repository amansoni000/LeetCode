class Solution {
    public List<Integer> partitionLabels(String s) {
        HashMap<Character, Integer> last_idx = new HashMap<>();
        char[] arr = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            last_idx.put(arr[i] , i);
        }
        int max = last_idx.get(arr[0]), i = 0;
        while(i < s.length()){
            String str = "";
            while(i < s.length()){
                if(i > max){
                    max = Math.max(last_idx.get(arr[i]), max);
                    break;
                }
                else{
                    max = Math.max(last_idx.get(arr[i]), max);
                    str += s.charAt(i);
                    i++;
                }
            }
            list.add(str.length());
        }
        return list;
    }
}