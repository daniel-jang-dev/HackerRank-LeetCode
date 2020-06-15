### 1480. [Running Sum of 1d Array](https://leetcode.com/problems/running-sum-of-1d-array)

```javascript
/**
 * @param {number[]} nums
 * @return {number[]}
 */
var runningSum = function(nums) {
  
  for(let i = 1; i < nums.length; i++) {
    nums[i] += nums[i-1];
  }
  return nums;
};
```
