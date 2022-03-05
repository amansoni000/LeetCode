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
    public void add(ArrayList<Integer> ls, TreeNode root){
        if(root == null){
            ls.add(0);
            return;
        }
        ls.add(root.val);
        add(ls, root.left);
        add(ls, root.right);
    }
    
    public boolean isSameTree(TreeNode p, TreeNode q) {
        ArrayList<Integer> ls_p = new ArrayList<>();
        ArrayList<Integer> ls_q = new ArrayList<>();
        
        add(ls_p, p);
        add(ls_q, q);
        
        if(ls_p.equals(ls_q)) return true;
        return false;
    }
}