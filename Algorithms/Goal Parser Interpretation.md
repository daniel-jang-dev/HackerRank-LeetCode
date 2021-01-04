## [1678. Goal Parser Interpretation](https://leetcode.com/problems/goal-parser-interpretation/)
```javascript
// JAVASCRIPT
// Runtime: 76 ms, faster than 82.31%
// Memory Usage: 38.9 MB, less than 10.27%
/**
 * @param {string} command
 * @return {string}
 */
var interpret = function(command) {
    let ans = '';
    for(let i = 0; i < command.length; i++) {
        const c = command[i];
        switch(c) {
            case 'G' :
                ans += c;
                break;
            case 'a' :
                ans += 'al';
                i += 2;
                break;
            case ')' :
                ans += 'o';
                break;
            default:
        }
    }
    return ans;
};
