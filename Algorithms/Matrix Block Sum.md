### 1314. [Matrix Block Sum](https://leetcode.com/problems/matrix-block-sum/)
```javascript
/**
 * @param {number[][]} mat
 * @param {number} K
 * @return {number[][]}
 */
var matrixBlockSum = function(mat, K) {
  return mat.map((row, i) => row.map((col, j) => getSum(i, j, mat, K)));
};

function getSum(x, y, mat, K) {
  let sum = 0;
  for(let i = Math.max(0, x - K); i <= Math.min(mat.length-1, x + K); i++) {
    for(let j = Math.max(0, y - K); j <= Math.min(mat[0].length-1, y + K); j++) {
      sum += mat[i][j];
    }
  }
  return sum;
}
```
