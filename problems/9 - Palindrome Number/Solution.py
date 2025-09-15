class Solution:
    def is_palindrome(self, x: int) -> bool:
        """
        Returns True if the given integer is a palindrome, False otherwise.

        A palindrome is a number that remains the same when its digits are reversed.
        For example, 121 and 12321 are palindromes, while 124 and 1001 are not.

        :param x: The input integer to check for being a palindrome
        :return: True if the integer is a palindrome, False otherwise
        """
        if x < 0 or (x % 10 == 0 and x > 0):
            return False

        reversed_num = 0
        temp = x
        while temp > 0:
            reversed_num = reversed_num * 10 + temp % 10
            temp //= 10

        return x == reversed_num
