### Week 4.5. [Longest Common Subsequence](https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3311/)
```javascript
/**
 * @param {string} text1
 * @param {string} text2
 * @return {number}
 */
var longestCommonSubsequence = function(text1, text2) {
  
  const m = text1.length;
  const n = text2.length;
  
  const dp = Array.from({length: m + 1}, () => Array.from({length: n + 1}, () => 0));
  
  for(let i = 1; i <= m; i++) {
    for(let j = 1; j <= n; j++) {
      if(text1[i-1] == text2[j-1]) {
        dp[i][j] = dp[i - 1][j - 1] + 1;
      } else {
        dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1]);
      }
    }
  }
  return dp[m][n];
};
```
