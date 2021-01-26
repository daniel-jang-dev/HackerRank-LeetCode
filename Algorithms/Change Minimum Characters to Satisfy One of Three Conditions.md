## [1737. Change Minimum Characters to Satisfy One of Three Conditions](https://leetcode.com/problems/change-minimum-characters-to-satisfy-one-of-three-conditions/)
```javascript
// Runtime: 144 ms, faster than 84.00% of JavaScript
// Memory Usage: 43.9 MB, less than 84.00% of JavaScript
/**
 * @param {string} a
 * @param {string} b
 * @return {number}
 */
var minCharacters = function(a, b) {
    
    const m = a.length;
    const n = b.length;
    
    const aa = Array(26).fill(0);
    const bb = Array(26).fill(0);
    
    for(let i = 0; i < m; i++) {
        aa[a.charCodeAt(i) - 97]++;
    }
    for(let i = 0; i < n; i++) {
        bb[b.charCodeAt(i) - 97]++;
    }

    let res = m + n;
    for(let i = 0; i < 26; i++) {
        res = Math.min(res, m + n - aa[i] - bb[i]); // condition 3
        if(i > 0) {
            aa[i] += aa[i-1];
            bb[i] += bb[i-1];
        }
        if(i < 25) {
            res = Math.min(res, m - aa[i] + bb[i]); // condition 1
            res = Math.min(res, n - bb[i] + aa[i]); // condition 2
        }
    }
    return res;
};
```
