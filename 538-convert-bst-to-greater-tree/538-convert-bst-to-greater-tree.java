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
    boolean flag = true;
    int k = 0, sum = 0;
    List<Integer> list = new ArrayList<>();
    public void traversal(TreeNode root){
        if(root == null) return;
        traversal(root.left);
        if(flag == true) list.add(root.val);
        else root.val = list.get(k++);
        traversal(root.right);
    }
    public TreeNode convertBST(TreeNode root) {
        traversal(root);
        flag = false;
        for(int i = list.size() - 1; i >= 0; i--){
            sum += list.get(i);
            list.set(i, sum);
        }
        traversal(root);
        return root;
    }
}