## [1557. Minimum Number of Vertices to Reach All Nodes](https://leetcode.com/problems/minimum-number-of-vertices-to-reach-all-nodes/)
```python
# Runtime: 1228 ms, faster than 34.34%
# Memory Usage: 53.1 MB, less than 61.12%
class Solution:
    def findSmallestSetOfVertices(self, n: int, edges: List[List[int]]) -> List[int]:
        s = set()
        e = set()
        for i, j in edges:
            s.add(i)
            e.add(j)
        return list(s.difference(e))
```
