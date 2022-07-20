class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> temp = new ArrayList<>();
        temp.add(1);
        list.add(temp);
        for(int i = 1; i < numRows; i++){
            temp = new ArrayList<>();
            List<Integer> temp1 = list.get(i-1);
            temp.add(1);
            for(int j = 0; j < temp1.size() - 1; j++){
                temp.add(temp1.get(j) + temp1.get(j+1));
            }
            temp.add(1);
            list.add(temp);
        }
        return list;
    }
}