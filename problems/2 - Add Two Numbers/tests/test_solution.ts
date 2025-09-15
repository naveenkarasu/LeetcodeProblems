import * as fs from 'fs';
import { addTwoNumbers } from '../solution';

interface ListNode {
  val: number;
  next?: ListNode;
}

function arrayToLinkedList(arr: number[]): ListNode | null {
  if (arr.length === 0) return null;

  const head = new ListNode(arr[0]);
  let current = head;
  for (let i = 1; i < arr.length; i++) {
    current.next = new ListNode(arr[i]);
    current = current.next;
  }
  return head;
}

function linkedListToArray(head: ListNode | null): number[] {
  const result: number[] = [];
  while (head !== null) {
    result.push(head.val);
    head = head.next;
  }
  return result;
}

const inputJson = fs.readFileSync(process.argv[2], 'utf8');
const inputData = JSON.parse(inputJson);

function runTest(testData: any): void {
  const l1 = arrayToLinkedList(testData.input.l1);
  const l2 = arrayToLinkedList(testData.input.l2);
  const result = addTwoNumbers(l1, l2);
  console.log(JSON.stringify({ result: linkedListToArray(result) }));
}

for (const testData of inputData.testCases) {
  runTest(testData);
}
