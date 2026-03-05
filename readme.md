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
