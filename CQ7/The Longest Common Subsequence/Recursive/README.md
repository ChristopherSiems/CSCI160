# The Longest Common Subsequence

My solution to this problem is a backtracking algorithm that builds intermediate subsequences of `a` and `b`. It builds every possible intermediate subsequence, recursively, and finds the longest of them to return. Starting from the back of each List every integer is checked against every other integer until matches are found, then the next integers are checked. The intermediate lists are finally returned when the index pointers go below 0.
