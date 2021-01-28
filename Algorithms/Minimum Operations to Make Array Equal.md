## [1551. Minimum Operations to Make Array Equal](https://leetcode.com/problems/minimum-operations-to-make-array-equal/)
```javascript
// Runtime: 92 ms, faster than 30.25%
// Memory Usage: 38.6 MB, less than 97.48%
/**
 * @param {number} n
 * @return {number}
 */
 
// Solution # 1
var minOperations = function(n) {
    let ans = 0;
    let i = 1;
    while(i < n) {
        ans += (n - i);
        i += 2;
    }
    return ans;
};

// Solution # 2
var minOperations = function(n) {
    const m = Math.floor(n / 2);
    return m * (n - m);
};
```
