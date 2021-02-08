## [1749. Maximum Absolute Sum of Any Subarray](https://leetcode.com/problems/maximum-absolute-sum-of-any-subarray/)
```javascript
// Runtime: 92 ms, faster than 100.00%
// Memory Usage: 51.4 MB, less than 100.00%
/**
 * @param {number[]} nums
 * @return {number}
 */
var maxAbsoluteSum = function(nums) {
    for(let i = 1; i < nums.length; i++) {
        nums[i] += nums[i-1];
    }
    return Math.max(...nums, 0) - Math.min(...nums, 0);
};
```
