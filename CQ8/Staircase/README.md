# Complexity

## Time

$\mathcal{O}(n^2)$. This algorithm contains a single for-loop that iterates $n$ times and in that for-loop there are two `String.repeat` calls. The runtime of `String.repeat` is $\mathcal{O}(n)$ when the given string is a single character. Combining the for-loop with the `String.repeat` call, the end runtime is $\mathcal{O}(n^2)$.

## Space

$\mathcal{O}(1)$. The algorithm only creates one auxiliary variable, the loop iterator `i`, regardless of the input size. So the required memory for this algorithm is constant.
