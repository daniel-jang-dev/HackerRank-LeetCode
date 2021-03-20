## 1289. [Minimum Falling Path Sum II](https://leetcode.com/problems/minimum-falling-path-sum-ii/submissions/)
```javascript
// Runtime: 144 ms, faster than 37.50% 
// Memory Usage: 42 MB, less than 94.17%
/**
 * @param {number[][]} arr
 * @return {number}
 */
var minFallingPathSum = function(arr) {
    
    const n = arr.length;
    if(n === 1) return arr[0][0];
    
    let ans = 10 ** 5;
    for (let i = 1; i < n; i++) {
        for (let j = 0; j < n; j++) {
            let min = 10 ** 5;
            for (let k = 0; k < n; k++) {
                if(j !== k) min = Math.min(min, arr[i-1][k]);
            }
            arr[i][j] += min;
            if(i === n - 1) ans = Math.min(ans, arr[i][j]);
        }
    }
    return ans;
};
```
