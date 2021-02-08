## [1750. Minimum Length of String After Deleting Similar Ends](https://leetcode.com/problems/merge-sorted-array/)
```javascript
// Runtime: 92 ms, faster than 76.12%
// Memory Usage: 46 MB, less than 13.43%
/**
 * @param {string} s
 * @return {number}
 */
var minimumLength = function(s) {
    
    do {
        let n = s.length;
        const first = s[0];
        const last = s[n-1];
        if(first != last || n == 1) {
            break;
        }
        // Delete prefix
        while(s[0] == first) {
            s = s.substring(1);
        }
        // Delete suffix
        while(s[s.length - 1] == last) {
            s = s.slice(0, -1);
        }
    } while(s.length > 0)
    return s.length;
};
```

