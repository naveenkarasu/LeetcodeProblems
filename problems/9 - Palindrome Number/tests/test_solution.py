import json
from pathlib import Path
import sys

# Helper methods to convert between arrays and ListNode
def array_to_list_node(arr):
    dummy = ListNode(0)
    current = dummy
    for num in arr:
        current.next = ListNode(num)
        current = current.next
    return dummy.next

def list_node_to_array(node):
    result = []
    while node:
        result.append(node.val)
        node = node.next
    return result

# Read JSON input from command line argument
if __name__ == "__main__":
    if len(sys.argv) != 2:
        print("Usage: python test_file.py <input_json>")
        sys.exit(1)

    with open(sys.argv[1], 'r') as f:
        input_data = json.load(f)

# Import the solution from the parent directory
sys.path.insert(0, str(Path(__file__).parent))
from palindrome_number import Solution

solution = Solution()

# Call the solution method and output JSON result
result = []
for test_case in input_data['testCases']:
    x = test_case['input']['x']
    expected = test_case['expected']
    actual = solution.isPalindrome(x)
    if actual == expected:
        result.append(1)
    else:
        result.append(0)

print(json.dumps({"result": result}))
