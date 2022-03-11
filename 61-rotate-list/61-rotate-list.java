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
    public ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(len == 0) return head;
        if(len == 1) return head;
        k = k%len;
        while(k > 0){
            temp = head;
            while(temp != null){
                if(temp.next.next == null){
                    ListNode new_node = new ListNode(temp.next.val);
                    temp.next = null;
                    new_node.next = head;
                    head = new_node;
                    break;
                }
                temp = temp.next;
            }
            k--;
        }
        return head;
        
    }
}