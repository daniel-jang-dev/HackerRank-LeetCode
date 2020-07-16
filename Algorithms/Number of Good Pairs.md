## 1512. [Number of Good Pairs](https://leetcode.com/problems/number-of-good-pairs/)

```javascript
/**
 * @param {number[]} nums
 * @return {number}
 */
var numIdenticalPairs = function(nums) {
  const map = {};
  nums.forEach(n => {
    map[n] = map[n] +1 || 1;
  });
  return Object.values(map)
    .reduce((a, b) => a + b * (b - 1) / 2
            , 0);
};
```
