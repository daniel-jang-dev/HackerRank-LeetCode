## [1689. Partitioning Into Minimum Number Of Deci-Binary Numbers](https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/)
```javascript
// Runtime: 92 ms, faster than 89.46%
// Memory Usage: 43.2 MB, less than 82.91%
/**
 * @param {string} n
 * @return {number}
 */
var minPartitions = function(n) {
   
    let ans = 0;
    for(let i = 0; i < n.length; i++) {
        const d = Number(n[i]);
        if(d == 9) return 9;
        ans = ans < d ? d : ans;
    }
    return ans;
};
```

```python
# Runtime: 76 ms, faster than 71.60%
# Memory Usage: 14.6 MB, less than 98.00%
class Solution:
    def minPartitions(self, n: str) -> int:
        return int(max(n))
```
