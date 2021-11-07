# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode, n: int) -> ListNode:
        count=1
        count2 = 1
        temp=head
        temp2=head
        temp3=head
        while(temp):
            temp=temp.next
            count+=1
        n=count-n
        print(n)
        if n==1:
            head=head.next
            return head        
        while(temp2):
                if(count2==n-1):
                    temp2.next = temp2.next.next
                temp2=temp2.next
                count2+=1
        return head
        
        

            