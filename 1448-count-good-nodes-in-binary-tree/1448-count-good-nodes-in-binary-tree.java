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
    int count = 0;
    public void Traversal(TreeNode root, int max){
        if(root == null){
            return;
        }
        if(root.val >= max){
            count += 1;
            max = root.val;
        }
        Traversal(root.left, max);
        Traversal(root.right, max);
    }
    public int goodNodes(TreeNode root) {
        Traversal(root, Integer.MIN_VALUE);
        return count;
    }
}