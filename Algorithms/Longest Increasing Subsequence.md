## [300. Longest Increasing Subsequence](https://leetcode.com/problems/longest-increasing-subsequence/)
```javascript
// # 1. Brute force, O(N^2)
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

// # 2. Patience Sorting, O(N logN)
// https://www.youtube.com/watch?v=22s1xxRvy28
// Runtime: 84 ms, faster than 94.21%
// Memory Usage: 39.6 MB, less than 55.52%

/**
 * @param {number[]} nums
 * @return {number}
 */
var lengthOfLIS = function(nums) {

    function getIndex(ar, x) {
        let left = 0, right = ar.length - 1;
        let mid;
        while(left <= right) {
            mid = Math.floor((left + right) / 2);
            if(ar[mid] < x) {
                left = mid + 1;
            } else {
                right = mid -1;
            }
        }
        return left;
    }

    const res = [];
    nums.forEach(x => {
        const targetIndex = getIndex(res, x);
        res[targetIndex] = x;
    });

    return res.length;
};
```
