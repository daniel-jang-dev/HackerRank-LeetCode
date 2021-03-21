## 1800. [Maximum Ascending Subarray Sum](https://leetcode.com/problems/maximum-ascending-subarray-sum/)
```javascript
// Runtime: 68 ms, faster than 100.00%
// Memory Usage: 38.4 MB, less than 100.00%
/**
 * @param {number[]} nums
 * @return {number}
 */
var maxAscendingSum = function(nums) {
    
    let ans = nums[0];
    let tmp = nums[0];
    
    for(let i = 1; i < nums.length; i++) {
        if(nums[i-1] >= nums[i]) tmp = 0;
        tmp += nums[i];
        if(ans < tmp) ans = tmp;
    }
    return ans;
    
};
```
