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
    public void solver(TreeNode root, int val, int depth, int level){
        if(root == null) return;
        if(level == depth-1){
            TreeNode left = root.left;
            TreeNode right = root.right;
            root.left = new TreeNode(val);
            root.right = new TreeNode(val);
            root.left.left = left;
            root.right.right = right;
        }
        solver(root.left, val, depth, level + 1);
        solver(root.right, val, depth, level + 1);
        
    }
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        if(depth == 1){
            TreeNode new_root = new TreeNode(val);
            new_root.left = root;
            return new_root;
        }
        solver(root, val, depth, 1);
        return root;
    }
}