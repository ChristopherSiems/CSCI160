# README

## Time Complexity

$O(1)$. The `List.sort()` method uses merge-sort to sort the given List, which has a runtime of $O(n \log n)$, however, in all cases this method is being called on a list of only five items and will thusly take a constant amount of time to compute regardless of the input. All other operations in the algorithm take constant time.

## Space Complexity

$O(n)$. `List.sort` uses merge sort to sort the given list. Merge sort is recursive and requires storing intermediate sublists, the size of which add to $n$ (where $n$ is the length of the original list). All other operations in the algorithm use constant space.
