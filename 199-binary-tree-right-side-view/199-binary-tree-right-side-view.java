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
    List<Integer> list = new ArrayList<>();
    int maxLevel = Integer.MIN_VALUE;
    public void traverse(TreeNode root, int level){
        if(root == null){
            return;
        }
        if(level > maxLevel){
            list.add(root.val);
            maxLevel = level;
        }
        traverse(root.right, level + 1);
        traverse(root.left, level + 1);
        
    }
    public List<Integer> rightSideView(TreeNode root) {
        int level = 0;
        traverse(root, 0);
        return list;
    }
}