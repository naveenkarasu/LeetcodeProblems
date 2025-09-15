# Problem: Palindrome Number (LeetCode #9)

**Problem Statement:**
Given an integer, determine whether it is a palindrome number. A palindrome number reads the same backward as forward.

**Example 1:**

- Input: 121

- Output: true

- Explanation: The number 121 reads as 121 from left to right and from right to left.

**Example 2:**

- Input: -121

- Output: false

- Explanation: From left to right, it reads -121. From right to left, it becomes 121-, therefore it is not a palindrome.

**Example 3:**

- Input: 10

- Output: false

- Explanation: Reads 01 from right to left. Therefore it is not a palindrome.


**Constraints:**
- -2^31 <= x <= 2^31 - 1
- Follow up: Could you solve it without converting the integer to a string?



**Approach:**

*Idea:* To solve this problem, we first check if the input number is negative or zero, in which case it cannot be a palindrome. Then, we convert the absolute value of the number to a string by repeatedly taking the last digit and appending it to the front of the result. Finally, we compare the original number with its reverse; if they are equal, then the number is a palindrome.

*Complexity:* Time: O(log n) | Space: O(1)

*Alternate Approaches:* A hash map can solve this in O(n) time by storing seen values and their indices.

**Solution - Java:**
[Java Solution](/problems/9%20-%20Palindrome%20Number/Solution.java)

**Solution - Python:**
[Python Solution](/problems/9%20-%20Palindrome%20Number/Solution.py)

**Solution - TypeScript:**
[TypeScript Solution](/problems/9%20-%20Palindrome%20Number/Solution.ts)


