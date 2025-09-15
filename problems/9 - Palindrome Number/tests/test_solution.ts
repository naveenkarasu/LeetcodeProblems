import * as fs from 'fs';
import * as path from 'path';

// Import the solution from the parent directory
const solution = require('../solution');

// Define interfaces and types for the test cases
interface TestCase {
  name: string;
  input: { x: number };
  expected: boolean;
}

// Helper method to convert between arrays and ListNode
function arrayToListNode(arr: number[]): ListNode | null {
  let head = new ListNode(arr[0]);
  let current = head;

  for (let i = 1; i < arr.length; i++) {
    const node = new ListNode(arr[i]);
    current.next = node;
    current = node;
  }

  return head;
}

function listNodeToArray(head: ListNode | null): number[] {
  const result: number[] = [];
  let current = head;

  while (current !== null) {
    result.push(current.val);
    current = current.next;
  }

  return result;
}

// Read JSON input from command line argument
const inputFile = process.argv[2];
if (!inputFile) {
  console.error('Please provide the input file path as a command line argument');
  process.exit(1);
}

const inputJson = fs.readFileSync(inputFile, 'utf8');
const inputData: TestCase[] = JSON.parse(inputJson);

// Call the solution method
for (const testCase of inputData) {
  const result = solution.isPalindrome(testCase.input.x);
  console.log(`Test case ${testCase.name}: Expected ${testCase.expected}, got ${result}`);
}

function ListNode(val?: number, next?: ListNode | null) {
  this.val = val === undefined ? 0 : val;
  this.next = next === undefined ? null : next;
}
