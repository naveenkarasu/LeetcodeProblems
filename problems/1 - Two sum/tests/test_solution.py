import json
from pathlib import Path
import sys

# Helper methods to convert between arrays and ListNode
def array_to_list(nums):
    dummy = ListNode(0)
    ptr = dummy
    for num in nums:
        ptr.next = ListNode(num)
        ptr = ptr.next
    return dummy.next

def list_to_array(head):
    arr = []
    while head:
        arr.append(head.val)
        head = head.next
    return arr

# Read JSON input from command line argument
if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python test_file.py <input.json>")
        sys.exit(1)

    with open(sys.argv[1], 'r') as f:
        input_data = json.load(f)

# Call the solution method
def two_sum(nums, target):
    num_dict = {}
    for i, num in enumerate(nums):
        complement = target - num
        if complement in num_dict:
            return [num_dict[complement], i]
        num_dict[num] = i
    return []

# Output JSON result
result = []
for test_case in input_data["testCases"]:
    nums = list_to_array(array_to_list(test_case["input"]["nums"]))
    target = test_case["input"]["target"]
    output = two_sum(nums, target)
    if output == test_case["expected"]:
        result.append({"name": test_case["name"], "result": output})
    else:
        print(f"Test case {test_case['name']} failed")

# Output JSON result in format: {"result": [1, 2, 3]}
print(json.dumps({"result": result}))
