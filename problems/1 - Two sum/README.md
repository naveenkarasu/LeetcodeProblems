# Problem: Two sum (LeetCode #1)

**Problem Statement:**
Given an array of integers and a target sum, I need to find two elements in the array that add up to the target. The function should return their indices.

**Example 1:**

- Input: [2,7,11,15], target = 9

- Output: [0,1]

- Explanation: The function returns the indices of the elements at positions 0 and 1 because their sum is equal to the target.

**Example 2:**

- Input: [3,2,4], target = 6

- Output: [1,2]

- Explanation: The function returns the indices of the elements at positions 1 and 2 because their sum is equal to the target.

**Example 3:**

- Input: [3,3], target = 6

- Output: [0,1]

- Explanation: The function returns the indices of the elements at positions 0 and 1 because their sum is equal to the target.


**Constraints:**
- -10^9 <= nums[i] <= 10^9
- -10^9 <= target <= 10^9
- 2 <= nums.length <= 10^4
- Only one valid answer exists.



**Approach:**

*Idea:* My code uses a brute-force approach with nested loops to compare each pair of elements in the array. For each element at index i, it checks if there is another element at index j (where j > i) such that their sum equals the target. If a match is found, it stores the indices and returns them. This process continues until all pairs have been checked.

*Complexity:* Time: O(n^2) | Space: O(1)

*Alternate Approaches:* A hash map can solve this in O(n) time by storing seen values and their indices.

**Solution - Java:**
[Java Solution](/problems/1%20-%20Two%20sum/Solution.java)

**Solution - Python:**
[Python Solution](/problems/1%20-%20Two%20sum/Solution.py)

**Solution - TypeScript:**
[TypeScript Solution](/problems/1%20-%20Two%20sum/Solution.ts)


