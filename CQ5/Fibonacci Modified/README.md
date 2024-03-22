# Complexity

## Time Complexity

$\mathcal{O}(n)$. The algorithm recurses $n - 1$ times doing constant time operations with each recurse. Because we express complexity with $\mathcal{O}$ notation, the $- 1$ part is ignored and we get a linear time complexity.

## Space Complexity

$\mathcal{O}(n)$. This solution is recursive, therefore, each instance of the variables `t1`, `t2`, and `n` need to be stored in memory at all times. That is $3(n - 1)$ variables being stored to compute the final solution. Because we express complexity with $\mathcal{O}$ notation, the coefficient 3 and the $- 1$ part is ignored and we get a linear space complexity.
