## [1018. Binary Prefix Divisible By 5](https://leetcode.com/problems/binary-prefix-divisible-by-5/)
```javascript
// Runtime: 96 ms, faster than 48.61%
// Memory Usage: 42.7 MB, less than 12.50%
/**
 * @param {number[]} A
 * @return {boolean[]}
 */
var prefixesDivBy5 = function(A) {
    let s = 0;
    const ans = [];
    for(let i = 0; i < A.length; i++) {
        s = (s * 2 + A[i]) % 5;
        ans.push(s % 5 == 0);
    }
    return ans;
};
```
