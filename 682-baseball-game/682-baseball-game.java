class Solution {
    public int calPoints(String[] ops) {
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for(int i = 0; i < ops.length; i++){
            if(ops[i].equals("C")){
                sum -= list.get(list.size() - 1);
                list.remove(list.size() - 1);
            }
            else if(ops[i].equals("D")){
                sum += list.get(list.size() - 1)*2;
                list.add(list.get(list.size() - 1)*2);
            }
            else if(ops[i].equals("+")){
                sum += list.get(list.size() - 1) + list.get(list.size() - 2);
                list.add(list.get(list.size() - 1) + list.get(list.size() - 2));
            }
            else{
                sum += Integer.parseInt(ops[i]);
                list.add(Integer.parseInt(ops[i]));
            }
        }
        // for(int i : list) sum += i;
        return sum;
    }
}