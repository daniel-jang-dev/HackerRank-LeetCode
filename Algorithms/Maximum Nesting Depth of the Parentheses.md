## [1614. Maximum Nesting Depth of the Parentheses](https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/)
```javascript
// Runtime: 88 ms, faster than 20.08%
// Memory Usage: 38.5 MB, less than 88.83%
/**
 * @param {string} s
 * @return {number}
 */
var maxDepth = function(s) {
    
    let count = 0;
    let max = 0;
    
    for(let c of s) {
        switch(c) {   
            case '(':
                count++;
                max = Math.max(count, max);
                break;
            case ')':
                count--;
                break;
        }
    }
    return max;
};
```

```python
# Runtime: 32 ms, faster than 54.55%
# Memory Usage: 14.3 MB, less than 5.86%
class Solution:
    def maxDepth(self, s: str) -> int:
        mx = 0
        count = 0
        for c in s:
            if c == '(':
                count += 1
                mx = max(mx, count)
            elif c == ')':
                count -= 1
        return mx
```
