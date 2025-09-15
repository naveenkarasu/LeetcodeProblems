class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next


class Solution:
    def addTwoNumbers(self, l1: ListNode, l2: ListNode) -> ListNode:
        """
        Adds two numbers represented as linked lists.

        Args:
            l1 (ListNode): The first number.
            l2 (ListNode): The second number.

        Returns:
            ListNode: The sum of the two numbers.
        """
        dummy = ListNode()
        current = dummy
        carry = 0

        while l1 or l2 or carry:
            # Calculate the sum of the current nodes and the carry
            total = carry
            if l1:
                total += l1.val
                l1 = l1.next
            if l2:
                total += l2.val
                l2 = l2.next

            # Update the carry and create a new node with the digit of the sum
            current.next = ListNode(total % 10)
            current = current.next
            carry = total // 10

        return dummy.next
