class Solution {
    public List<Integer> partitionLabels(String s) {
        int[] last = new int[26];
        char[] arr = s.toCharArray();
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < s.length(); i++){
            last[s.charAt(i) - 'a'] = i;
        }
        int max = last[s.charAt(0) - 'a'], i = 0;
        while(i < s.length()){
            int len = 0;
            while(i < s.length()){
                if(i > max){
                    max = Math.max(last[s.charAt(i) - 'a'], max);
                    break;
                }
                else{
                    max = Math.max(last[s.charAt(i) - 'a'], max);
                    len++;
                    i++;
                }
            }
            list.add(len);
        }
        return list;
    }
}