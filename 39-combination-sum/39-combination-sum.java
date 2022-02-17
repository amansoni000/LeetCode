class Solution {
    List<List<Integer>> result = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        solution(candidates, 0, target, new ArrayList<Integer>());
        return result;
    }
    public void solution(int[] candidates, int start, int target, ArrayList<Integer> list){
        for(int i=start; i<candidates.length; i++){
            ArrayList<Integer> temp = new ArrayList<Integer>(list);
            if(candidates[i] == target){
                temp.add(candidates[i]);
                result.add(temp);
            }
            else if(candidates[i] < target){
                temp.add(candidates[i]);
                solution(candidates, i, target - candidates[i], temp);
            }
            else break;
        }
    }
}