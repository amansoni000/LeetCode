/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

class Solution {
    public void helper(TreeNode root, TreeNode p, List<Integer> ls){
        if(root == null) return;
        if(root == p){
            ls.add(root.val);
            return;
        }
        ls.add(root.val);
        if(p.val < root.val) helper(root.left, p, ls);
        if(p.val > root.val) helper(root.right, p, ls);
    }
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        List<Integer> ls1 = new ArrayList<>();
        List<Integer> ls2 = new ArrayList<>();        
        helper(root, p, ls1);
        helper(root, q, ls2);
        int i = 0, j = 0;
        for(; i < ls1.size() && j < ls2.size();){
            if(ls1.get(i).equals(ls2.get(j))){
                i++;
                j++;
            }
            else break;
        }
        TreeNode ans = new TreeNode(ls1.get(i-1));
        return ans;
    }
}