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
    List<Integer> list = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    public void traversal(TreeNode root){
        if(root == null) return;
        traversal(root.left);
        if(flag == true) list.add(root.val);
        else root.val = map.get(root.val);
        traversal(root.right);
    }
    public TreeNode convertBST(TreeNode root) {
        traversal(root);
        flag = false;
        int sum = 0;
        for(int i = list.size() - 1; i >= 0; i--){
            sum += list.get(i);
            map.put(list.get(i) , sum);
        }
        traversal(root);
        return root;
    }
}