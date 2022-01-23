class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        ArrayList<Integer> ls = new ArrayList<>();
        int number = 0;
        for(int i=1; i<10; i++){
            String s = String.valueOf(i);
            for(int j=i+1; j<10; j++){
                s+=String.valueOf(j);
                number = Integer.parseInt(s);
                if(number>=low && number <= high){
                    ls.add(number);
                }
            }
        }
        Collections.sort(ls);
        return ls;
    }
}