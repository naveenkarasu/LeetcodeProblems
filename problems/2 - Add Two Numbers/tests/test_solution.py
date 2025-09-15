import json
from pathlib import Path
import sys

# Import solution from parent directory
sys.path.insert(0, str(Path(__file__).parent))
from add_two_numbers_solution import Solution

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

def test_add_two_numbers():
    solution = Solution()
    
    # Read JSON input from command line argument
    if len(sys.argv) > 1:
        with open(sys.argv[1], 'r') as f:
            data = json.load(f)
    else:
        print("Error: Input file not provided")
        return
    
    for test_case in data['testCases']:
        l1 = array_to_list_node(test_case['input']['l1'])
        l2 = array_to_list_node(test_case['input']['l2'])
        
        result = solution.addTwoNumbers(l1, l2)
        expected = list_node_to_array(result)
        
        if expected == test_case['expected']:
            print(f"Test case {test_case['name']} passed")
        else:
            print(f"Test case {test_case['name']} failed: Expected {test_case['expected']}, got {expected}")

if __name__ == "__main__":
    test_add_two_numbers()
