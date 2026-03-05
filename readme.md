# Use Case 4 — Queue + Stack Symmetry

## Overview
Loads characters into both a queue (FIFO) and a stack (LIFO) and compares by polling/popping.

## Algorithm
- Enqueue all chars; push all chars
- While not empty: compare `queue.poll()` vs `stack.pop()`

## Complexity
- Time: O(n)
- Space: O(n)
