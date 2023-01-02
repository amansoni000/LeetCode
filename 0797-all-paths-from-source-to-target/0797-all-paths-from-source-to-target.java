class Solution {
    int n;
    int[][] newGraph;
    List<List<Integer>> result = new ArrayList<>();
    public void helper(int[] arr, List<Integer> temp){
        for(int i = 0; i < arr.length; i++){
            temp.add(arr[i]);
            if(arr[i] == n){
                List<Integer> dummy = new ArrayList<>(temp);
                result.add(dummy);
            }
            else{
                helper(newGraph[arr[i]], temp);
            }
            temp.remove(temp.size() - 1);
        }
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        n = graph.length - 1;
        newGraph = graph;
        
        List<Integer> temp = new ArrayList<>();
        temp.add(0);
        helper(graph[0], temp);
        return result;
    }
}