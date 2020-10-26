## 1512. [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)


```javascript
/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function(nums) {
  const m = {};
  nums.forEach(n => {
    m[n] = m[n] + 1 || 1;
  });
  
  return Object.values(m).map(n => n * (n-1) / 2).reduce((a, b) => a + b);
};
```
