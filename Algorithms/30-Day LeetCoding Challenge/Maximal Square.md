### Week 4.6. [Maximal Square](https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3312/)
```javascript
/**
 * @param {character[][]} matrix
 * @return {number}
 */
var maximalSquare = function(matrix) {
  const m = matrix.length;
  if (m === 0) return 0;
  const n = matrix[0].length;
  let max = 0;
  const dp = [];
  
  for (let i = 0; i <= m; i++) {
    dp[i] = [];
    for (let j = 0; j <= n; j++) {
      if(i * j == 0) {
        dp[i][j] = 0;
      } else {
        // if the current matrix cell equals 1
        if (matrix[i - 1][j - 1] === '1') {
          const min = Math.min(dp[i - 1][j], dp[i][j - 1], dp[i - 1][j - 1]);
          dp[i][j] = min + 1;
          max = Math.max(max, dp[i][j]);
          } else {
            dp[i][j] = 0;
          }
      }
    }
  }
  return max * max;
};
```
