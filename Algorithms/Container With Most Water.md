## [11. Container With Most Water](https://leetcode.com/problems/container-with-most-water/)
```javascript
// Runtime: 68 ms, faster than 99.74%
// Memory Usage: 41.1 MB, less than 40.95%
/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    const len = height.length;
    let i = 0, j = len - 1, ans = 0;
    while(i <= j) {
        const left = height[i], right = height[j];
        ans = Math.max(ans, (j - i) * Math.min(left, right));
        if(left < right) {
            i++;
        } else {
            j--;
        }
    }
    return ans;
};


// Runtime: 1120 ms, faster than 19.19%
// Memory Usage: 41.2 MB, less than 40.95%
/**
 * @param {number[]} height
 * @return {number}
 */
var maxArea = function(height) {
    const len = height.length;
    let ans = 0;
    for(let i = 0; i < len - 1; i++) {
        for(let j = i+1; j < len; j++) {
            const area = Math.min(height[i], height[j]) * (j - i);
            ans = Math.max(ans, area);
        }
    }
    return ans;
};
```
