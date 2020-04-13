### Week 2.6. [Contiguous Array](https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3298/)
```javascript
/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxLength = function(nums) {
  let m = [0];
  for(let i = 0; i < nums.length; i++) {
    m[i+1] = m[i] + (nums[i] == 0 ? -1 : 1);
  }
  const vals = [...new Set(m)];
  const lengths = vals.map(v => m.lastIndexOf(v)- m.indexOf(v));
  return Math.max(...lengths);
};

```
