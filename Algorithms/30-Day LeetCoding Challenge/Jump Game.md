### Week 4.4. [Jump Game](https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/531/week-4/3310/)
```javascript
/**
 * @param {number[]} nums
 * @return {boolean}
 */
 
// Solution # 1.
var canJump = function(nums) {
  let reach = 0;
  for (let i = 0; i < nums.length; i++) {
    if (i > reach) return false;
    reach = Math.max(reach, i + nums[i]);
  }
  return true;
};

// Solution # 2.
var canJump = function(nums) {
  let right = 0;
  for (let i = 0; i <= right && i < nums.length; i++) {
    right = Math.max(right, i + nums[i]);
  }
  return right >= nums.length - 1;
};

// Solution # 3.
var canJump = function(nums) {
  let max = 0;
  for (let i = 0; i < nums.length; i++) {
    if (i > max) return false;    
    if (i + nums[i] >= nums.length - 1) return true;
    max = Math.max(max, i + nums[i]);
  }
};
```
