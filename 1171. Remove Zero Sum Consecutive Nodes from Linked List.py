class Solution(object):
    def removeZeroSumSublists(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        prefix = 0
        seen = {}
        seen[0] = dummy = ListNode(0)
        dummy.next = head
        while head:
            prefix += head.val
            seen[prefix] = head
            head = head.next
        head = dummy
        prefix = 0
        while head:
            prefix += head.val
            head.next = seen[prefix].next
            head = head.next
        return dummy.next
        
        
        