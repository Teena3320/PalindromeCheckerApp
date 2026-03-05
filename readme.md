# Use Case 10 — Normalized Palindrome Validation

## Overview
Normalizes the input by removing non-alphanumeric characters and lowercasing.

## Algorithm
- Normalize via regex: keep `[A-Za-z0-9]`, lowercase
- Two-pointer compare

## Complexity
- Time: O(n)
- Space: O(n) if a new normalized string is created
