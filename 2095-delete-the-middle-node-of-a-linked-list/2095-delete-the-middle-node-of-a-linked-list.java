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
    public ListNode deleteMiddle(ListNode head) {
        ListNode temp = head, prev = null;
        int len = 0;
        while(temp != null){
            temp = temp.next;
            len++;
        }
        len = len/2;
        temp = head;
        if(len == 0){
            head = null;
            return head;
        }
        while(len > 0){
            prev = temp;
            temp = temp.next;
            len--;
        }
        prev.next = temp.next;
        return head;
        
    }
}