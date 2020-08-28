## 53. [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/)
```javascript
/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {
  const arr = [nums[0]];
  for(let i = 1; i < nums.length; i++) {
    arr[i] = Math.max(arr[i-1] + nums[i], nums[i]);
  }
  return Math.max(...arr);
};
```
