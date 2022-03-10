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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode temp1 = l1, temp2 = l2, curr = dummyHead;
        int sum=0, carry=0;
        while(temp1 != null || temp2 != null){
            int x = (temp1 != null) ? temp1.val : 0;
            int y = (temp2 != null) ? temp2.val : 0;
            sum = x + y + carry;
            
            carry = sum/10;
            sum = sum % 10;
            
            curr.next = new ListNode(sum);
            curr = curr.next;
            
            if (temp1 != null) temp1 = temp1.next;
            if (temp2 != null) temp2 = temp2.next;
        }
        if (carry > 0) {
        curr.next = new ListNode(carry);
        }
        return dummyHead.next;
    }
}