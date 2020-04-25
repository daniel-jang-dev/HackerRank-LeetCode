### Week4.3. [Bitwise AND of Numbers Range](https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3308/)
```javascript
/**
 * @param {number} m
 * @param {number} n
 * @return {number}
 */
var rangeBitwiseAnd = function(m, n) {
  while(n > m) {
    n = n & (n-1);
  }
  return n;
};

```
