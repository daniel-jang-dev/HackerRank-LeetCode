## [1636. Sort Array by Increasing Frequency](https://leetcode.com/problems/sort-array-by-increasing-frequency/)
```javascript
// Runtime: 92 ms, faster than 88.64%
// Memory Usage: 41.3 MB, less than 37.28%
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var frequencySort = function(nums) {
    const m = {};
    nums.forEach(k => {
        m[k] = m[k] ? m[k] + 1 : 1;
    });
    const ans = [];
    Object.entries(m).sort((a, b) => a[1] == b[1] ? b[0] - a[0] : a[1] - b[1]).forEach(pair => {
        let c = pair[1];
        while(c) {
            ans.push(pair[0]);
            c--;
        }
    });
    return ans;
};
```
