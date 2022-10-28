/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public void reorderList(ListNode head) {
        Stack<ListNode> stk = new Stack<>();
        Queue<ListNode> que = new LinkedList<>();
        ListNode curr = head, prev = head;
        while(curr != null){
            stk.add(curr);
            que.add(curr);
            curr = curr.next;
        }
        que.poll();
        int size = stk.size(), i = 1;
        while(i < size){
            if(i % 2 != 0){
                prev.next = stk.pop();
                prev = prev.next;
            }
            else{
                prev.next = que.poll();
                prev = prev.next;
            }
            prev.next = null;
            i++;
        }
    }
}