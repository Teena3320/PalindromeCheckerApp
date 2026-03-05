# Use Case 1 — Basic Palindrome Check

## Overview
A minimal palindrome validation that compares characters from both ends moving inward.

## Algorithm
- Two-pointer approach
- Compare `s[i]` with `s[j]` while `i < j`
- If any mismatch occurs → not a palindrome

## Complexity
- Time: O(n)
- Space: O(1)

# Use Case 2 — Case-Insensitive Palindrome

## Overview
Extends the basic check by lowercasing input to ignore case differences.

## Algorithm
- Convert to lowercase
- Two-pointer comparison

## Complexity
- Time: O(n)
- Space: O(1) (if done via char access), O(n) if you create a new lowercase string

# Use Case 3 — Stack-Based Palindrome

## Overview
Uses a stack to reverse the string and compares with the original.

## Algorithm
- Push all characters onto a stack
- Pop to build reversed string
- Compare original vs reversed

## Complexity
- Time: O(n)
- Space: O(n)

 # Use Case 4 — Queue + Stack Symmetry

## Overview
Loads characters into both a queue (FIFO) and a stack (LIFO) and compares by polling/popping.

## Algorithm
- Enqueue all chars; push all chars
- While not empty: compare `queue.poll()` vs `stack.pop()`

## Complexity
- Time: O(n)
- Space: O(n)

# Use Case 5 — Stack Reversal (Single Structure)

## Overview
Demonstrates reversal using only a stack and then compares.

## Steps
- Push all characters
- Pop to build reversed
- Compare reversed with original

## Complexity
- Time: O(n)
- Space: O(n)

# Use Case 6 — Queue + Stack Fairness Check

## Overview
Validates a palindrome by comparing front of a queue with top of a stack.

## Algorithm
- Offer (enqueue) and push each character
- While queue not empty:
  - Compare `queue.poll()` with `stack.pop()`

## Complexity
- Time: O(n)
- Space: O(n)

# Use Case 7 — Deque-Based Optimized Check

## Overview
Uses a `Deque` to remove from both ends without building a reversed string.

## Algorithm
- Add all chars to deque
- While size > 1:
  - Compare `removeFirst()` and `removeLast()`

## Complexity
- Time: O(n)
- Space: O(n) (deque stores characters)

# Use Case 8 — LinkedList Double-Ended Check

## Overview
Uses `LinkedList<Character>` and compares by removing from both ends.

## Algorithm
- Add chars via `addLast`
- While `list.size() > 1`:
  - Compare `removeFirst()` vs `removeLast()`

## Complexity
- Time: O(n)
- Space: O(n)

# Use Case 9 — Recursive Palindrome Checker

## Overview
Checks palindrome recursively by comparing outer characters and recursing inward.

## Algorithm
- Base case: `start >= end` → true
- If mismatch at `(start, end)` → false
- Recurse with `(start+1, end-1)`

## Complexity
- Time: O(n)
- Space: O(n) due to recursion stack

# Use Case 10 — Normalized Palindrome Validation

## Overview
Normalizes the input by removing non-alphanumeric characters and lowercasing.

## Algorithm
- Normalize via regex: keep `[A-Za-z0-9]`, lowercase
- Two-pointer compare

## Complexity
- Time: O(n)
- Space: O(n) if a new normalized string is created

# Use Case 11 — Object-Oriented Palindrome Service

## Overview
Encapsulates palindrome logic in a `PalindromeService` class. Promotes reusability and separation of concerns.

## Structure
- `UseCase11PalindromeCheckerApp` (main)
- `PalindromeService` (logic)

## Complexity
- Time: O(n)
- Space: O(1)/O(n) depending on normalization approach

# Use Case 12 — Strategy Pattern for Palindrome Algorithms

## Overview
Demonstrates algorithm interchangeability using the Strategy pattern. Includes `StackStrategy` and a `TwoPointerStrategy` example.

## Structure
- `PalindromeStrategy` (interface)
- `StackStrategy` (concrete strategy)
- `TwoPointerStrategy` (optional additional strategy)
- `UseCase12PalindromeCheckerApp` (injects and runs a strategy)

# Use Case 13 — Performance Comparison

## Overview
Measures execution time of a selected palindrome algorithm (or compares two) and prints elapsed time.

## What It Shows
- Start/end time capture
- Total duration in nanoseconds
- Optional per-run averages (if using a looped micro-benchmark)
