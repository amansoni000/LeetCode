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
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) return head;
        if(head.next == null) return head;
        ListNode prev = head, curr = head.next, temp = head, temp2 = head;
        int count = 0;
        while(prev != null && curr != null){
            if(curr.val == prev.val){
                curr = curr.next;
                count++;
            }
            else{
                if(count > 0){
                    prev = temp;
                    if(prev == temp2 && head.val == head.next.val) head = curr;
                    else prev.next = curr;
                }
                else{
                    temp = prev;
                    prev.next = curr;
                    prev = curr;
                    curr = curr.next;
                }
                count = 0;
            }
        }
        if(count > 0){
            prev = temp;
            if(prev == temp2 && head.val == head.next.val)head = curr;
            else prev.next = curr;
        }
        return head;
    }
}