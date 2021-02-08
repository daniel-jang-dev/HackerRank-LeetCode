## [1753. Maximum Score From Removing Stones](https://leetcode.com/problems/maximum-score-from-removing-stones/)
```javascript
// Runtime: 292 ms, faster than 100.00%
// Memory Usage: 44.5 MB, less than 100.00%
/**
 * @param {number} a
 * @param {number} b
 * @param {number} c
 * @return {number}
 */
var maximumScore = function(a, b, c) {
    let count = 0;
    let arr = [a, b, c].sort((x, y) => x - y);
    while(arr[1] > 0) {
        arr[1]--;
        arr[2]--;
        arr.sort((x, y) => x - y);
        count++;
    }
    return count;
};
```
