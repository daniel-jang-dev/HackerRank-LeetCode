## [1051. Height Checker](https://leetcode.com/problems/height-checker/)
```javascript
// Runtime: 80 ms, faster than 71.24%
// Memory Usage: 38.6 MB, less than 79.10%
/**
 * @param {number[]} heights
 * @return {number}
 */
var heightChecker = function(heights) {
    const original = heights.map(e => e);
    heights.sort((a, b) => a - b);
    let ans = 0;
    for(let i = 0; i < heights.length; i++) {
        if(heights[i] != original[i]) ans++;
    }
    return ans;
};
```
