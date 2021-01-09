## [1662. Check If Two String Arrays are Equivalent](https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/)
```javascript

/**
 * @param {string[]} word1
 * @param {string[]} word2
 * @return {boolean}
 */
 
// #1. String concatenation
// Runtime: 72 ms, faster than 92.58%
// Memory Usage: 38.5 MB, less than 89.89%
var arrayStringsAreEqual = function(word1, word2) {
    return word1.join('') === word2.join('');
};

// #2. iterating elements with 4 pointers, Space = O(1)
// Runtime: 104 ms, faster than 5.05%
// Memory Usage: 38.7 MB, less than 64.23%
var arrayStringsAreEqual = function(word1, word2) {
    let i = 0, j = 0, x = 0, y = 0;
    
    while(i < word1.length && j < word2.length) {

        if(word1[i][x] != word2[j][y]) return false;
        
        if(x == word1[i].length - 1) {
            x = 0;
            i++;
        } else {
            x++;
        }
        
        if(y == word2[j].length - 1) {
            y = 0;
            j++;
        } else {
            y++;
        }
    }
    return i == word1.length && j == word2.length;
};
```

```python
# Runtime: 24 ms, faster than 96.59%
# Memory Usage: 14.2 MB, less than 63.95%
class Solution:
    def arrayStringsAreEqual(self, word1: List[str], word2: List[str]) -> bool:
        return ''.join(word1) == ''.join(word2)
```        
