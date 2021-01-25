## [1694. Reformat Phone Number](https://leetcode.com/problems/reformat-phone-number/)
```javascript
// Runtime: 80 ms, faster than 69.52% of JavaScript
// Memory Usage: 38.7 MB, less than 84.63% of JavaScript
/**
 * @param {string} number
 * @return {string}
 */
var reformatNumber = function(number) {
    number = number.replace(/[^Z0-9]/g, "");
    const len = number.length;
    let ans = '';
    if(len % 3 == 1) {
        for(let i = 0; i < len - 4; i++) {
            if(i > 0 && i % 3 == 0) {
                ans += "-";
            }            
            ans += number[i];
        }
        if(len != 4) {
            ans += "-";
        }
        ans += number.substring(len - 4 , len - 2) + "-" + number.substring(len - 2);
    } else {
        for(let i = 0; i < len; i++) {
            if(i > 0 && i % 3 == 0 && i < len - 1) {
                ans += "-";
            }
            ans += number[i];
        }
    }
    return ans;
};
```
