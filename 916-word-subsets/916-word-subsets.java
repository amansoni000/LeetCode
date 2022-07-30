class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        List<String> list = new ArrayList<>();
        int[] total = new int[26];
        for(int i = 0; i < words2.length; i++){
            int[] temp = new int[26];
            String str = words2[i];
            for(int j = 0; j < str.length(); j++){
                int idx = str.charAt(j) - 'a';
                temp[idx] += 1;
                total[idx] = Math.max(total[idx], temp[idx]);
            }
        }
        for(int i = 0; i < words1.length; i++){
            int[] temp = new int[26];
            String str = words1[i];
            for(int j = 0; j < str.length(); j++){
                int idx = str.charAt(j) - 'a';
                temp[idx] += 1;
            }
            boolean flag = true;
            for(int j = 0; j < 26; j++){
                if(temp[j] < total[j]){
                    flag = false;
                }
            }
            if(flag == true) list.add(str);
        }
        return list;
    }
}