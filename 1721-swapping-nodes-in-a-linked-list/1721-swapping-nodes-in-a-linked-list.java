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
        ListNode point1 = null, point2 = null, curr = head;
        int len = 1, count = 1;
        while(curr != null){
            if(len == k) point1 = curr;
            curr = curr.next;
            len++;
        }
        curr = head;
        while(curr != null){
            if(count == len - k){
                point2 = curr;
                break;
            }
            curr = curr.next;
            count++;
        }
        int temp = point1.val;
        point1.val = point2.val;
        point2.val = temp;
        return head;
    }
}