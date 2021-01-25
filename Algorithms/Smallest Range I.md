## [908. Smallest Range I](https://leetcode.com/problems/smallest-range-i/)
```javascript
// Runtime: 64 ms, faster than 100.00% of JavaScript
// Memory Usage: 40.2 MB, less than 38.98% of JavaScript
/**
 * @param {number[]} A
 * @param {number} K
 * @return {number}
 */
var smallestRangeI = function(A, K) {
    const maxV = Math.max(...A);
    const minV = Math.min(...A);
    return Math.max(0, maxV - minV - 2 * K);
};
```

```python
# Runtime: 108 ms, faster than 87.46% of Python3
# Memory Usage: 15.2 MB, less than 85.12% of Python3
class Solution:
    def smallestRangeI(self, A: List[int], K: int) -> int:
        return max(0, max(A) - min(A) - 2 * K);
```
