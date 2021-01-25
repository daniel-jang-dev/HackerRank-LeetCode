## [1716. Calculate Money in Leetcode Bank](https://leetcode.com/problems/calculate-money-in-leetcode-bank/)
```javascript
// Runtime: 80 ms, faster than 75.63% of JavaScript
// Memory Usage: 38.6 MB, less than 27.81% of JavaScript
/**
 * @param {number} n
 * @return {number}
 */
var totalMoney = function(n) {
    const q = Math.floor(n/ 7);
    const r = n % 7;
    const qSum = q * (2 * 28 + (q - 1) * 7) / 2;
    const rSum = r * (r + 1) / 2 + q * r;
    return qSum + rSum;
};
```

```python
# Runtime: 28 ms, faster than 94.02% of Python3
# Memory Usage: 14.4 MB, less than 9.64% of Python3
class Solution:
    def totalMoney(self, n: int) -> int:
        q = n // 7;
        r = n % 7;
        qSum = q * (2 * 28 + (q - 1) * 7) // 2;
        rSum = r * (r + 1) // 2 + q * r;
        return qSum + rSum;
```
