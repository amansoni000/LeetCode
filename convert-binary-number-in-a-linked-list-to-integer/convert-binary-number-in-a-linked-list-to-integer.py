# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def getDecimalValue(self, head: ListNode) -> int:
        arr = []
        curr = head
        value=0
        while(curr!=None):
            arr.append(curr.val)
            curr = curr.next
        for i in range(len(arr)):
            value += arr[i]*(10**(len(arr)-1-i))
        value = str(value)
        binary = int(value,2)
        return binary
            
        