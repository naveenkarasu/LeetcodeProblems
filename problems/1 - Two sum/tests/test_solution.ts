import * as fs from 'fs';
import { Solution } from '../solution';

interface TestCase {
  name: string;
  input: {
    nums: number[];
    target: number;
  };
  expected: number[];
}

const testCases: TestCase[] = [
  {
    name: "Example 1",
    input: {
      nums: [2,7,11,15],
      target: 9
    },
    expected: [0, 1]
  },
  {
    name: "Empty Array",
    input: {
      nums: [],
      target: 5
    },
    expected: []
  },
  {
    name: "Single Element",
    input: {
      nums: [1],
      target: 2
    },
    expected: []
  },
  {
    name: "Duplicate Elements",
    input: {
      nums: [3, 4, 5, 6, 7],
      target: 8
    },
    expected: [2, 3]
  },
  {
    name: "Large Array",
    input: {
      nums: [1, 2, 3, 4, 5, 6, 7, 8, 9, 10],
      target: 20
    },
    expected: [8, 9]
  }
];

function readJsonFile(filePath: string): any {
  return JSON.parse(fs.readFileSync(filePath, 'utf8'));
}

function writeJsonFile(filePath: string, data: any) {
  fs.writeFileSync(filePath, JSON.stringify(data));
}

function runTestCases(solution: Solution, testCases: TestCase[]) {
  for (const testCase of testCases) {
    const result = solution.twoSum(testCase.input.nums, testCase.input.target);
    if (JSON.stringify(result) === JSON.stringify(testCase.expected)) {
      console.log(`Test case ${testCase.name} passed`);
    } else {
      console.log(`Test case ${testCase.name} failed`);
      writeJsonFile('test_result.json', { result: testCase.expected });
    }
  }
}

function main() {
  const solution = new Solution();
  runTestCases(solution, testCases);
}

main();
