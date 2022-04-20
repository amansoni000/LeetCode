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
    TreeNode first = null, second = null, prev = new TreeNode(Integer.MIN_VALUE);
    public void inorder(TreeNode root){
        if(root == null){
            return;
        }
        inorder(root.left);
        if(prev.val > root.val){
            if(first == null)
                first = prev;
            second = root;
        }
        prev = root;
        inorder(root.right);
        
    }
    public void recoverTree(TreeNode root) {
        inorder(root);
        int temp = second.val;
        second.val = first.val;
        first.val = temp;
    }
}