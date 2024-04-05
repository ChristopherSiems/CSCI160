# Explanation

The recursive algorithm I built breaks the problem into 2 pieces:

1. The maximum subarray sum
2. The maximum subsequence sum

## Maximum Subarray

This recursion works by returning the calculated sum of the current subarray when all elements of the subarray have been considered.

Before that case, the recursion makes calls to itself incrementing the index being examined considering the cases where the current element is in the subarray and not in the subarray. It finds the max sum of all possible subarrays this way.

## Maximum Subsequence

This recursion works very similarly to Longest Increasing Subsequence, it considers all possible cases where each element in the array is included or not included and finds the max sum.
