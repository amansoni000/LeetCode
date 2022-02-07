/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public void helper(HashMap<Integer, ArrayList<Integer>> map , TreeNode node, int level){
        if(node == null) return;
        ArrayList<Integer> ls = map.getOrDefault(level, new ArrayList<Integer>());
        ls.add(node.val);
        map.put(level, ls);
        
        helper(map, node.left, level + 1);
        helper(map, node.right, level + 1);
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        
        helper(map, root, 0);
        int level = 0;
        while(map.containsKey(level)){
             ans.add(map.get(level++));
        }
        return ans;
    }
}