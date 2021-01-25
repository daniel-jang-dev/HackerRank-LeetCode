## [1732. Find the Highest Altitude](https://leetcode.com/problems/find-the-highest-altitude/)
```javascript
// Runtime: 80 ms, faster than 100.00% of JavaScript
// Memory Usage: 38.9 MB, less than 100.00% of JavaScript
/**
 * @param {number[]} gain
 * @return {number}
 */
var largestAltitude = function(gain) {
    
    const arr = [0];
    let ans = 0;
    for(let i = 0; i < gain.length; i++) {
        arr[i+1] = arr[i] + gain[i];
        ans = Math.max(ans, arr[i+1]);
    }
    return ans;
};
```

```python
# Runtime: 32 ms, faster than 100.00% of Python3
# Memory Usage: 14.2 MB, less than 100.00% of Python3
class Solution:
    def largestAltitude(self, gain: List[int]) -> int:
        arr = [0]
        res = 0
        for i in range(len(gain)):
            arr.append(arr[i] + gain[i])
            res = max(res, arr[i+1])
        return res
```
