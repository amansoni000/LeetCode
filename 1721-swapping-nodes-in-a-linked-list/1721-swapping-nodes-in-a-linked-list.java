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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode curr = head;
        int len = 1, count = 1, temp1 = 0, temp2 = 0;
        while(curr != null){
            if(len == k) temp1 = curr.val;
            curr = curr.next;
            len++;
        }
        curr = head;
        while(curr != null){
            if(count == len - k){ 
                temp2 = curr.val;
                break;
            }
            curr = curr.next;
            count++;
        }
        curr = head;
        count = 1;
        while(curr != null){
            if(count == k) curr.val = temp2;
            if(count == len - k) curr.val = temp1;
            curr = curr.next;
            count++;
        }
        return head;
    }
}