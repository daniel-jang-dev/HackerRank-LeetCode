## [1588. Sum of All Odd Length Subarrays](https://leetcode.com/problems/sum-of-all-odd-length-subarrays/)
```javascript
// Runtime: 84 ms, faster than 64.96%
// Memory Usage: 38.9 MB, less than 51.49%
/**
 * @param {number[]} arr
 * @return {number}
 */
var sumOddLengthSubarrays = function(arr) {
    
    const len = arr.length;
    let k = 1;
    let ans = 0;
    while(k <= len) {
        for(let i = 0; i + k <= len; i++) {
            for(let j = i; j < i + k; j++) {
                ans += arr[j];
            }
        }
        k += 2;
    }
    return ans;
    
};
```
