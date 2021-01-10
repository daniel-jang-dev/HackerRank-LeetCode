## [1720. Decode XORed Array](https://leetcode.com/problems/decode-xored-array/)
```javascript
// Runtime: 160 ms, faster than 100%
// Memory Usage: 45.4 MB, less than 100%
/**
 * @param {number[]} encoded
 * @param {number} first
 * @return {number[]}
 */
var decode = function(encoded, first) {
    const decoded = [ first ];
    encoded.forEach(e => {
        decoded.push( (e ^ decoded[decoded.length - 1]) );
    });
    return decoded;
};
```
