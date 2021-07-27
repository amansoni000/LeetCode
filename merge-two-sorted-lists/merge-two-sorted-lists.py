# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, l1: ListNode, l2: ListNode) -> ListNode:
        l4 = l3 = ListNode(0)
        if l1==None and l2==None:
            l3.next=l1
        while (l1!=None) and (l2!=None):
            if l1.val < l2.val:
                l3.next=l1
                l1=l1.next
            else:
                l3.next=l2
                l2=l2.next
            l3=l3.next
        if l1==None or l2==None:
            l3.next=l1 or l2
        return l4.next
    
    
            
            