### 2020 May 12th. [Single Element in a Sorted Array](https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/535/week-2-may-8th-may-14th/3327/)
```javascript
/**
 * @param {number[]} nums
 * @return {number}
 */
var singleNonDuplicate = function(nums) {
  let l = 0;
  let r = nums.length - 1;

  while (l <= r) {
    const m = Math.floor((r + l) / 2);
    if (nums[m] === nums[m - 1]) {
      if ((m - 2 - l + 1) % 2 === 0) { // check if remaining left is even
        l = m + 1;
      } else {
        r = m - 2;
      }
    } else if (nums[m] === nums[m + 1]) {
      if ((r - (m + 2) + 1) % 2 === 0) { // check if remaining right is even
        r = m - 1;
      } else {
        l = m + 2;
      }
    } else {
      return nums[m];
    }
  }
  return -1;
};
```
