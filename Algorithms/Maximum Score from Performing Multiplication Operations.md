## [1770. Maximum Score from Performing Multiplication Operations](https://leetcode.com/problems/maximum-score-from-performing-multiplication-operations/)
```javascript
// Runtime: 4816 ms, faster than 100.00%
// Memory Usage: 170.1 MB, less than 100.00%
/**
 * @param {number[]} nums
 * @param {number[]} multipliers
 * @return {number}
 */
var maximumScore = function(nums, multipliers) {
    
   const mem = multipliers.map(_ => multipliers.map(_ => null));
    
    function dp(l, r, i) {
        if(i == multipliers.length) return 0;
        if(mem[l][r] != null) return mem[l][r];
        
        const m = multipliers[i];
        const left = nums[l] * m;
        const right = nums[r] * m;
        
        i++;
        mem[l][r] = Math.max(dp(l+1, r, i) + left, dp(l, r-1, i) + right);
        return mem[l][r];
    }
    
    return dp(0, nums.length - 1, 0);
};
```
