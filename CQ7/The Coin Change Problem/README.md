# The Coin Change Problem

My solution to the coin change problem is a backtracking algorithm that checks every possible combination of coins to include in the final change. It recursively checks both cases, where each coin is included and not included, and tracks what the remaining value of the change will have to be for each included coin. Each found solution returns a 1 and each non-solution returns a 0, the sum of all returned values is the final solution.

The base cases are:

1. If the remaining amount of the change is 0, that means that no more coins need to be added and a solution has been found.

2. If the remaining amount of change is negative or if there are no more coins that can be used, that means that a solution has not been found and a 0 must be returned.
