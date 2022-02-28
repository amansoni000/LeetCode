class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> list = new ArrayList<String>();
        List<List<Integer>> ans = new ArrayList<>();
        if(nums.length == 0) return list;
        int temp = nums[0], i = 0;
        List<Integer> ls = new ArrayList<>();
        ls.add(temp);
        while( i < nums.length){
            if(nums[i] == temp){
                temp++;
                i++;
            }
            else{
                ls.add(temp-1);
                ans.add(ls);
                ls = new ArrayList<>();
                ls.add(nums[i]);
                temp = nums[i];
            }
        }
        ls.add(temp-1);
        ans.add(ls);
        for(i = 0; i<ans.size(); i++){
            List<Integer> lst = new ArrayList<>(ans.get(i));
            String s = "";
            if((double)lst.get(0) != (double)lst.get(1)){
                s += String.valueOf(lst.get(0));
                s += "->";
                s += String.valueOf(lst.get(1));
            } 
            else{
                s = String.valueOf(lst.get(0));
            }
            list.add(s);
        }
        System.out.println(ans);
        return list;
    }
}