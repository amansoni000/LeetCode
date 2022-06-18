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
        ListNode temp1 = l1, temp2 = l2, newlist = new ListNode(-1);
        ListNode ans = newlist;
        int carry = 0, sum = 0;
        while(temp1 != null && temp2 != null){
            sum = temp1.val + temp2.val + carry;
            carry = sum/10;
            sum = sum%10;
            ListNode temp = new ListNode(sum);
            newlist.next = temp;
            newlist = newlist.next;
            temp1 = temp1.next;
            temp2 = temp2.next;
        }
        while(temp1 != null){
            sum = temp1.val + carry;
            carry = sum/10;
            sum = sum%10;
            ListNode temp = new ListNode(sum);
            newlist.next = temp;
            newlist = newlist.next;
            temp1 = temp1.next;
        }
        while(temp2 != null){
            sum = temp2.val + carry;
            carry = sum/10;
            sum = sum%10;
            ListNode temp = new ListNode(sum);
            newlist.next = temp;
            newlist = newlist.next;
            temp2 = temp2.next;
        }
        if(carry != 0){
            ListNode temp = new ListNode(carry);
            newlist.next = temp;
            newlist = newlist.next;
        }
        return ans.next;
    }
}