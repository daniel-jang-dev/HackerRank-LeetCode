## 985. [Sum of Even Numbers After Queries](https://leetcode.com/problems/sum-of-even-numbers-after-queries/)

```javascript
/**
 * @param {number[]} A
 * @param {number[][]} queries
 * @return {number[]}
 */
var sumEvenAfterQueries = function(A, queries) {
  
  return queries.map(([d, i]) => {
    A[i] += d;
    return A.reduce((a, b) => b % 2 ? a : a + b, 0);
  });
  
};
```
