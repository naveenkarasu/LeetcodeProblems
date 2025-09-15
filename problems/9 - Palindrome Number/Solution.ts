/**
 * Checks if a given integer is a palindrome.
 *
 * @param {number} x The input number to check.
 * @returns {boolean} True if the number is a palindrome, false otherwise.
 */
export function isPalindrome(x: number): boolean {
    // Edge case handling for negative numbers and even numbers
    if (x < 0 || (x % 10 === 0 && x > 0)) return false;

    let r = 0;
    const temp = x;
    while (temp > 0) {
        r = r * 10 + temp % 10;
        temp = Math.floor(temp / 10);
    }

    // Compare the original number with its reverse
    return x === r;
}
