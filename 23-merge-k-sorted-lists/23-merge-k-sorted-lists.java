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
    public ListNode merge(ListNode ls1, ListNode ls2){
        ListNode newlist = new ListNode(0);
        ListNode temp1 = ls1, temp2 = ls2, curr = newlist;
        while(temp1 != null && temp2 != null){
            if(temp1.val <= temp2.val){
                curr.next = temp1;
                temp1 = temp1.next;
            }
            else if(temp1.val > temp2.val){
                curr.next = temp2;
                temp2 = temp2.next;
            }
            curr = curr.next;
        }
        if(temp1 != null){
            curr.next = temp1;
        }
        else{
            curr.next = temp2;
        }
        return newlist.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode newlist = new ListNode(0);
        if(lists.length == 1){
            return lists[0];
        }
        if(lists.length == 0){
            return null;
        }
        ListNode temp1 = lists[0], curr = newlist;
        
        while(temp1 != null){
            curr.next = temp1;
            curr = curr.next;
            temp1 = temp1.next;
        }
        for(int i=1 ;i<lists.length; i++){
            newlist.next = merge(newlist.next, lists[i]);
        }
        return newlist.next;
    }
}