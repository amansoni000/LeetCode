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
    public TreeNode insertIntoMaxTree(TreeNode root, int v) {
        if(root==null) return new TreeNode(v);
        if(root.val < v){
            TreeNode node = new TreeNode(v);
            node.left = root;
            return node;
        }
        root.right = insertIntoMaxTree(root.right, v);
        return root;
    }
}