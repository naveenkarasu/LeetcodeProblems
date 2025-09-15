interface NumArray {
  [index: number]: number;
}

function twoSum(nums: NumArray, target: number): number[] {
  /**
   * Returns an array of indices of the two numbers in the input array that add up to the target.
   *
   * @param {NumArray} nums - The input array of numbers.
   * @param {number} target - The target sum.
   * @returns {number[]} An array containing the indices of the two numbers that add up to the target.
   */
  const result: number[] = [0, 0];
  for (let i = 0; i < nums.length; i++) {
    for (let j = i + 1; j < nums.length; j++) {
      if ((nums[i] + nums[j]) === target) {
        result[0] = i;
        result[1] = j;
      }
    }
  }
  return result;
}

export default twoSum;
