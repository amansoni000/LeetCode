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
    TreeNode traverse(TreeNode root,TreeNode list){
        if(root == null) return list;
        TreeNode temp = traverse(root.right,list);
        root.right = traverse(root.left,temp);
        root.left = null;
        return root;
    }
    public void flatten(TreeNode root) {
        traverse(root,null);
    }
}