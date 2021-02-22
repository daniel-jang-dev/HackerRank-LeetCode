## [1768. Merge Strings Alternately](https://leetcode.com/problems/merge-strings-alternately/)
```javascript
// Runtime: 92 ms, faster than 100.00%
// Memory Usage: 40.2 MB, less than 100.00%
/**
 * @param {string} word1
 * @param {string} word2
 * @return {string}
 */
var mergeAlternately = function(word1, word2) {
    
    let ans = '';
    for(let i = 0; i < Math.max(word1.length, word2.length); i++) {
        if(word1[i]) ans += word1[i];
        if(word2[i]) ans += word2[i];
    }
    return ans;
};
```
