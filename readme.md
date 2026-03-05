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
