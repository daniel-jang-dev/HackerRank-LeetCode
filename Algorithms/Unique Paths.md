### 62. [Unique Paths](https://leetcode.com/problems/unique-paths/)
```javascript
/* # 1. Dynamic Programming O(n^2) */
/**
 * @param {number} m
 * @param {number} n
 * @return {number}
 */
var uniquePaths = function(m, n) {
  const arr = [];
  for(let i = 0; i < m; i++) {
    arr[i] = [];
    for(let j = 0; j < n; j++) {
      if(i == 0 || j == 0) {
        arr[i][j] = 1;
      } else {
        arr[i][j] = arr[i-1][j] + arr[i][j-1];
      }
    }
  }
  return arr[m-1][n-1];
};

/* # 2. Factorial O(n) */
/**
 * @param {number} m
 * @param {number} n
 * @return {number}
 */
var uniquePaths = function(m, n) {
  return factorial(m + n - 2) / factorial(m - 1) / factorial(n - 1);
};

function factorial(n) {
  const a = [1];
  for(let i = 1; i <= n; i++) {
    a[i] = a[i-1] * i;
  }
  return a[n];
}
```
