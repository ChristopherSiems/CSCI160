# Find the Path

## Pseudocode

```
find_the_path(a[1..n, 1..m], queries[1..p, 1..2])
  queue = new priority_queue
  for vertex in a
    vertex.dist = ∞
    queue add vertex
  list = new array
  for query[1..2] in queries
    queue = queue copy
    start = query[1]
    start.dist = a[start]
    while |queue| =/= 0
      curr = queue dequeue
      if curr = query[2]
        list add curr.dist
        break
      for neighbor in curr.neighbors
        neighbor.dist = curr.dist + a[neighbor]
  return list
```

## Intuition

This algorithm uses a modified version of Dijkstra's Algorithm to find the paths with the smallest values in accordance with the problem statement. The algorithm uses a priority queue to always check the current shortest path first. This means that the algorithm will only check the target grid-space if it is the current shortest path. The effect of this is that the algorithm finds the correct shortest path to the target grid-space. As, if the found path to the target grid-space is the current shortest, all other paths that eventually reach the target grid-space must be at least as long.

## Time Complexity

$\mathcal{O}(qnm \log (nm))$. This is a pretty crazy complexity so I will break it down. `for query[1..2] in queries` will iterate $q$ (the number of queries) times. Inside this loop, `while |queue| =/= 0` will iterate a number proportional to $nm$ (the number of grid-squares) times. And inside this loop, `neighbor.dist = curr.dist + a[neighbor]` will be executed at most 4 times, but will take $\log (nm)$ time to execute (assuming the priority queue is a binary heap), as the updated value needs to be sorted into place. The rest of this algorithm will take less time to execute and is this left out of the complexity.
