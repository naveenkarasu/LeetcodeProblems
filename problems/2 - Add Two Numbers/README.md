# Problem: Add Two Numbers (LeetCode #2)

**Problem Statement:**
I need to add two numbers represented as linked lists, where each node's value is a digit. The result should also be a linked list representing the sum of the input numbers. I must handle carry values when adding digits.

**Example 1:**

- Input: [2,4,3], [5,6,4]

- Output: [7,0,8]

- Explanation: The sum of 342 and 465 is 807, which is represented as the linked list [7,0,8].

**Example 2:**

- Input: [0], [0]

- Output: [0]

- Explanation: The sum of two zeros is zero.

**Example 3:**

- Input: [9,9,9,9,9,9,9], [9,9,9,9]

- Output: [8,9,9,9,0,0,0,1]

- Explanation: The sum of 99999999 and 9999 is 100000098.


**Constraints:**
- The number of nodes in each linked list is in the range [1, 100].
- 0 <= Node.val <= 9
- It is guaranteed that the list represents a number that does not have leading zeros.



**Approach:**

*Idea:* To solve this problem, I'll traverse both linked lists simultaneously, keeping track of any carry value that arises from adding digits. For each pair of nodes, I'll calculate their sum and create a new node with the least significant digit (i.e., the remainder when divided by 10). If there's a carry, I'll add it to the next iteration. Finally, if there's still a carry after traversing both lists, I'll create one more node for it.

*Complexity:* Time: O(n + m) | Space: O(n + m)

*Alternate Approaches:* A hash map can solve this in O(n) time by storing seen values and their indices.

**Solution - Java:**
[Java Solution](/problems/2%20-%20Add%20Two%20Numbers/Solution.java)

**Solution - Python:**
[Python Solution](/problems/2%20-%20Add%20Two%20Numbers/Solution.py)

**Solution - TypeScript:**
[TypeScript Solution](/problems/2%20-%20Add%20Two%20Numbers/Solution.ts)


