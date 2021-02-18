## [1637. Widest Vertical Area Between Two Points Containing No Points](https://leetcode.com/problems/widest-vertical-area-between-two-points-containing-no-points/)
```javascript
// Runtime: 208 ms, faster than 53.30%
// Memory Usage: 62.8 MB, less than 50.25%
/**
 * @param {number[][]} points
 * @return {number}
 */
var maxWidthOfVerticalArea = function(points) {
    const arr = points.map(a => a[0]).sort((a, b) => a - b);
    let ans = 0;
    for(let i = 1; i < arr.length; i ++) {
        ans = Math.max(ans, arr[i] - arr[i-1]);
    }
    return ans;
};
```
