/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode a = headA, b = headB;
        List<ListNode> listA = new ArrayList<>();
        List<ListNode> listB = new ArrayList<>();
        while(a != null || b != null){
            if(a != null){
                listA.add(a);
                a = a.next;
            }
            if(b != null){
                listB.add(b);
                b = b.next;
            }
        }
        int i = listA.size() - 1, j = listB.size() - 1, p = i, q = j;
        while(i >= 0 || j >= 0){
            if(i < 0) p = 0;
            if(j < 0) q = 0;
            if(listA.get(p) != listB.get(q)){
                break;
            }
            if(i >= 0){
                i--;
                p = i;
            }
            if(j >= 0){
                j--;
                q = j;
            }
        }
        if(i < listA.size() - 1) return listA.get(i+1);
        if(j < listB.size() - 1) return listB.get(j+1);
        else return null;
    }
}