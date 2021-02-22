## [1769. Minimum Number of Operations to Move All Balls to Each Box](https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/)
```javascript
// Runtime: 112 ms, faster than 100.00% 
// Memory Usage: 41.9 MB, less than 100.00%
/**
 * @param {string} boxes
 * @return {number[]}
 */
var minOperations = function(boxes) {
    
    function dp(str, p, arr, acc, ones) {
        arr[p] = acc;
        if(p > 0) {
            acc += ones;
        }
        // update 0 to p-1
        if(str[p] == 1) {
            for(let i = 0; i < p; i++) {
                arr[i] += p - i;
            }
            acc++;
            ones++;
        }
        if(str.length - 1 == p) return;
        
        dp(str, p + 1, arr, acc, ones);
    }
    
    const ans = [];
    dp(boxes, 0, ans, 0, 0);
    return ans;
};
```
