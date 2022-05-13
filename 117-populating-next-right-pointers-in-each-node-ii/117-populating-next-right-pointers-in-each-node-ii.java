/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

class Solution {
    public void traversal(Node root, HashMap<Integer,List<Node>> map, int level){
        if(root == null) return;
        List<Node> temp = map.getOrDefault(level, new ArrayList<Node>());
        temp.add(root);
        map.put(level, temp);
        traversal(root.left, map, level + 1);
        traversal(root.right, map, level + 1);
    }
    public Node connect(Node root){
        HashMap<Integer, List<Node>> map = new HashMap<>();
        traversal(root, map, 0);
        for (Map.Entry<Integer, List<Node>> entry : map.entrySet()){
            List<Node> list = entry.getValue();
            for(int i = 0; i < list.size() - 1; i++){
                list.get(i).next = list.get(i+1);
            }
            list.get(list.size() - 1).next = null;
        }
        return root;
    }
}