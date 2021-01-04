## [1684. Count the Number of Consistent Strings](https://leetcode.com/problems/count-the-number-of-consistent-strings/)
```javascript
// Javascript
// Runtime: 108 ms, faster than 91.91%
// Memory Usage: 48.9 MB, less than 41.43%
/**
 * @param {string} allowed
 * @param {string[]} words
 * @return {number}
 */
var countConsistentStrings = function(allowed, words) {

    function isValid(word) {
        let i = 0;
        while(i < word.length) {
            if (allowed.includes(word[i])) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }     
    return words.filter(w => isValid(w)).length;
};

```

```python
# Python 3
# Runtime: 216 ms, faster than 93.72%
# Memory Usage: 16.2 MB, less than 48.39%
class Solution:
    def countConsistentStrings(self, allowed: str, words: List[str]) -> int:
        
        ans = 0
        for word in words:
            isValid = True;
            for c in word:
                if c not in allowed:
                    isValid = False;
                    break;
            if isValid:
                ans += 1
        
        return ans
                    
```
