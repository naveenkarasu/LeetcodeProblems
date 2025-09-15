interface ListNode {
  val: number;
  next?: ListNode;
}

function addTwoNumbers(l1: ListNode | null, l2: ListNode | null): ListNode | null {
  let l3: ListNode | null = null;
  let l4: ListNode | null = l3;
  let a: ListNode | null = l1;
  let b: ListNode | null = l2;
  let carry: number = 0;

  for (; a !== null || b !== null; ) {
    const sum = carry;
    if (a !== null) {
      sum += a.val;
      a = a.next;
    }
    if (b !== null) {
      sum += b.val;
      b = b.next;
    }

    const temp: number = sum % 10;
    const t1: ListNode = { val: temp, next: undefined };
    if (l3 === null) {
      l4 = l3 = t1;
    } else {
      l3.next = t1;
      l3 = l3.next;
    }
    carry = Math.floor(sum / 10);
  }

  if (carry !== 0) {
    const t1: ListNode = { val: carry, next: undefined };
    l3!.next = t1;
  }

  return l4;
}

export default addTwoNumbers;
