class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word, map.getOrDefault(word, 0) + 1);
        }
        String[][] array = new String[map.size()][2];
        List<String> list = new ArrayList<>();
        int i = 0;
        for(Map.Entry<String, Integer> entry : map.entrySet()){
            array[i][0] = entry.getKey();
            array[i][1] = String.valueOf(entry.getValue());
            i++;
        }
        Arrays.sort(array, (a,b) ->  Integer.parseInt(b[1]) -  Integer.parseInt(a[1]) != 0 ? Integer.parseInt(b[1]) -  Integer.parseInt(a[1]) :
                    (a[0].compareTo(b[0])));
        for(int j = 0; j < k; j++){
            list.add(array[j][0]);
        }
        return list;
    }
}