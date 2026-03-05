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
