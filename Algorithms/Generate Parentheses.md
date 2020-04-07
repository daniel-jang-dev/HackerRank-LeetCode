### 22. [Generate Parentheses](https://leetcode.com/problems/generate-parentheses/submissions/)
```javascript
/**
 * @param {number} n
 * @return {string[]}
 */
var generateParenthesis = function(n) {
  const ans = [];
  backtrack(ans, '', n, n, n * 2);
  return ans;
};

function backtrack(ans, str, left, right, total) {
  
  if(total == 0) {
    ans.push(str);
    return;
  }
  
  if(left == 0) {
    backtrack(ans, str + ')', left, right-1, total-1);
    return;
  }
  
  backtrack(ans, str + '(', left-1, right, total-1);
  if(left != right) {
    backtrack(ans, str + ')', left, right-1, total-1);
  }
  
}
```
