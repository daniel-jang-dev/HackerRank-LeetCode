### [Max Consecutive Ones](https://leetcode.com/problems/max-consecutive-ones/)
```javascript
/**
 * @param {number[]} nums
 * @return {number}
 */
var findMaxConsecutiveOnes = function(nums) {
  
  if(nums.length == 1) {
    return nums[0];
  }
  if(nums.every(e => e == 0)) {
    return 0;
  }
  
  let max = 1;
  let count = 1;
  for(let i = 1; i < nums.length; i++) {
    if(nums[i] == 1 && nums[i-1] == nums[i]) {
      count++;
      if(count > max) {
        max = count;
      }
    } else {
      count = 1;
    }
  }
  return max;
};
```
