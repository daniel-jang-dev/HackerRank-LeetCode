## [300. Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)
```javascript
// Runtime: 188 ms, faster than 32.01%
// Memory Usage: 39.8 MB, less than 42.22%
/**
 * @param {number[]} nums
 * @return {number}
 */
var lengthOfLIS = function(nums) {
    
    if(!nums.length) return 0;
    
    const dp = nums.map(_ => 0);
    dp[0] = 1;
    let ans = 1;
    for(let i = 1; i < dp.length; i++) {
        let maxV = 0;
        for(let j = 0; j < i; j++) {
            if(nums[i] > nums[j]) {
                maxV = Math.max(maxV, dp[j]);
            }
        }
        dp[i] = maxV + 1;
        ans = Math.max(ans, dp[i]);
    }
    return ans;
};
```
