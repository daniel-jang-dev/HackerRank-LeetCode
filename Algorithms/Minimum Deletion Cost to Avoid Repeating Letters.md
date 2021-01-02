## [1578. Minimum Deletion Cost to Avoid Repeating Letters](https://leetcode.com/problems/minimum-deletion-cost-to-avoid-repeating-letters/)

```typescript
// TYPESCRIPT
// Runtime: 100 ms, faster than 100.00%
// Memory Usage: 50.2 MB, less than 66.67%

function minCost(s: string, cost: number[]): number {
  
  let result = 0;
  let prev = 0;
  
  for(let i = 1; i < s.length; i++) {
    if(s[prev] != s[i]) {
      prev = i;
    } else {
      result += Math.min(cost[prev], cost[i]);
      if(cost[prev] < cost[i]) {
        prev = i;
      }
    }
  }
  return result;
};
```

```python
# PYTHON 3
# Runtime: 1092 ms, faster than 70.25%
# Memory Usage: 25.2 MB, less than 54.35%

class Solution:
    def minCost(self, s: str, cost: List[int]) -> int:
      prev = result = 0
      for i in range(1, len(s)):
        if(s[prev] != s[i]):
          prev = i
        else:
          result += min(cost[prev], cost[i])
          if(cost[prev] < cost[i]):
            prev = i
      return result
``` 
