### 1277. [Count Square Submatrices with All Ones](https://leetcode.com/problems/count-square-submatrices-with-all-ones/)
```javascript
/**
 * @param {number[][]} matrix
 * @return {number}
 */
var countSquares = function(m) {
  let res = 0;
  for(let i = 0; i < m.length; i++) {
    for(let j = 0; j < m[0].length; j++) {
      if (m[i][j] == 1 && i > 0 && j > 0) {
        m[i][j] = Math.min(m[i - 1][j - 1], Math.min(m[i][j - 1], m[i - 1][j])) + 1;
      }
      res += m[i][j];
    }
  }
  return res;
}
```
