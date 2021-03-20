## 931. [Minimum Falling Path Sum](https://leetcode.com/problems/minimum-falling-path-sum/)
```javascript
// Runtime: 80 ms, faster than 93.68% 
// Memory Usage: 39.4 MB, less than 98.85%

/**
 * @param {number[][]} A
 * @return {number}
 */
var minFallingPathSum = function(A) {
    
    const n = A.length;
    if(n == 1) return A[0][0];
    
    let ans = 10 ** 4;
    for(let i = 1; i < n; i ++) {
        for(let j = 0; j < n; j++) {
            let min = A[i-1][j];
            if(j > 0) min = Math.min(min, A[i-1][j-1]);
            if(j + 1 < n) min = Math.min(min, A[i-1][j+1]);
            A[i][j] += min;
            
            if(i === n - 1) ans = Math.min(ans, A[i][j]);
        }
    }
    return ans;
};
```
