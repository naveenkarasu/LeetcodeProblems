class Solution:
    def two_sum(self, nums: list[int], target: int) -> list[int]:
        """
        Returns an array of indices of the two numbers in the input array that add up to the target.

        Args:
            nums (list[int]): A list of integers.
            target (int): The target sum.

        Returns:
            list[int]: An array containing the indices of the two numbers that add up to the target.
        """
        ar = [-1, -1]  # Initialize with invalid indices
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                if nums[i] + nums[j] == target:
                    ar[0] = i
                    ar[1] = j
                    return ar  # Return as soon as we find a pair
        return ar  # Return empty array if no pair is found

    def solve(self, nums: list[int], target: int) -> list[int]:
        return self.two_sum(nums, target)
