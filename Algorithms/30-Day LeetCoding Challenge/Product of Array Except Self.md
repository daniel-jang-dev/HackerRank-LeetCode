### Week 3.1. [Product of Array Except Self](https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/530/week-3/3300/)
```javascript
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var productExceptSelf = function(nums) {
  
  const ln = nums.length;
  
  const p1 = [1];
  for(let i = 0; i < ln-1; i++) {
    p1[i+1] = p1[i] * nums[i];
  }
  
  const p2 = [];
  p2[ln-1] = 1;
  for(let i = ln - 1; i >0 ; i--) {
    p2[i-1] = p2[i] * nums[i];
  }
  
  return nums.map((_,i) => p1[i] * p2[i]);
};
```
