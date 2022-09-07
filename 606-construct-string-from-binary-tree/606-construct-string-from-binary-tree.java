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
    String str = "";
    public void traverse(TreeNode root){
        if(root == null){
            return;
        }
        str += '(';
        str += String.valueOf(root.val);
        if(root.left == null && root.right != null){
            str += "()";
        }
        traverse(root.left);
        traverse(root.right);
        str += ')';
    }
    public String tree2str(TreeNode root) {
        traverse(root);
        return str.substring(1,str.length()-1);
    }
}