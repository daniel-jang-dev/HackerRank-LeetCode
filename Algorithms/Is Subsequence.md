## [392. Is Subsequence](https://leetcode.com/problems/is-subsequence/)
```javascript
// Runtime: 80 ms, faster than 71.70%
// Memory Usage: 38.6 MB, less than 71.70%
/**
 * @param {string} s
 * @param {string} t
 * @return {boolean}
 */
var isSubsequence = function(s, t) {

    let ptr = 0;
    for(let i = 0; i < t.length; i++) {
        if(s[ptr] == t[i]) {
            ptr++;
        }
    }
    return ptr == s.length;
};
```
