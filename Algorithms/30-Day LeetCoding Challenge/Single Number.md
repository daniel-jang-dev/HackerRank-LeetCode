### Week 1.1. [Single Number](https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3283/)
```javascript
/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNumber = function(nums) {
  const m = {};
  nums.forEach(key => {
    m[key] = m[key] + 1 || 1;
  });
  return Object.keys(m).find(key =>  m[key] == 1);
};
```
