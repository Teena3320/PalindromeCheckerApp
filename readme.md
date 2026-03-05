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
