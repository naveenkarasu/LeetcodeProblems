# LeetCode Problems Collection

This repository contains my solutions to LeetCode problems with support for multiple programming languages (Java, Python, TypeScript) and comprehensive documentation.

## 📁 Project Structure

```
LeetcodeProblems/
├── problems/                   # LeetCode problem solutions
│   └── {number} - {name}/      # Individual problem folders
│       ├── Solution.java       # Java solution (primary)
│       ├── Solution.py         # Python solution
│       ├── Solution.ts         # TypeScript solution
│       ├── explanation.json    # Problem explanation and analysis
│       ├── README.md           # Problem documentation
│       └── tests/              # Test suite for all languages
└── README.md                   # This file
```

## 🚀 Quick Start

### Prerequisites
- Java JDK 11+ (for Java solutions)
- Python 3.7+ (for Python solutions)
- Node.js 18+ and TypeScript (for TypeScript solutions)

### Viewing Solutions

Each problem folder contains:
- **Solution.java** - Primary Java implementation
- **Solution.py** - Python implementation
- **Solution.ts** - TypeScript implementation
- **README.md** - Detailed problem documentation with examples
- **explanation.json** - Problem analysis and complexity breakdown
- **tests/** - Comprehensive test suite for all languages

## 🧪 Testing

Each problem folder contains a `tests/` directory with:
- `test-cases.json` - Language-agnostic test cases
- `TestSolution.java` - Java test wrapper
- `test_solution.py` - Python test wrapper
- `test_solution.ts` - TypeScript test wrapper
- `test-runner.ps1` - Generic test runner
- `package.json` - TypeScript dependencies

To run tests:
```powershell
cd "problems\1 - Two sum\tests"
npm install
.\test-runner.ps1 -Language "all"
```

## 🔧 Features

- **Multi-Language Support**: Solutions in Java, Python, and TypeScript
- **Comprehensive Documentation**: Detailed README with examples and explanations
- **Automated Testing**: Language-agnostic test suite for all implementations
- **Problem Analysis**: Complexity analysis and approach explanations
- **Consistent Structure**: Standardized format across all problems

## 📝 Problem Examples

### Two Sum (Problem #1)
- **Java**: `problems/1 - Two sum/Solution.java`
- **Python**: `problems/1 - Two sum/Solution.py`
- **TypeScript**: `problems/1 - Two sum/Solution.ts`
- **Documentation**: `problems/1 - Two sum/README.md`

## 🤖 Automation Note

This repository is maintained using automated tools for:
- Code conversion between languages
- Documentation generation
- Test case creation
- Problem analysis and complexity calculation

The automation scripts are kept in a separate repository to keep this collection focused on the actual LeetCode solutions and documentation.

##  Workflow

1. **Create Problem Folder**: `problems/{number} - {name}/`
2. **Add Java Solution**: Create `Solution.java` with your implementation
3. **Generate Documentation**: Use automation tools to create:
   - `Solution.py` (Python version)
   - `Solution.ts` (TypeScript version)
   - `explanation.json` (Problem analysis)
   - `README.md` (Formatted documentation)
   - `tests/` (Complete test suite)
4. **Test Solutions**: Run tests to verify all implementations work
5. **Commit Changes**: Add to version control