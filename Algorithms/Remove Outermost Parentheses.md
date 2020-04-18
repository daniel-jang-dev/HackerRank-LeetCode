### 1021. [Remove Outermost Parentheses](https://leetcode.com/problems/remove-outermost-parentheses/)
```javascript
/**
 * @param {string} S
 * @return {string}
 */
var removeOuterParentheses = function(S) {
  const a = [1];
  let ans = '';
  let opened = true;
  for(let i = 1; i < S.length; i++) {
    const c = S[i];
    a[i] = S[i] == '(' ? a[i-1] + 1 : a[i-1] - 1;
    if(!opened && a[i] == 1) {
      opened = true;
      continue;
    } else if (opened && a[i] == 0) {
      opened = false;
    }
    if(opened) {
      ans += S[i];
    }
  };
  return ans;
};
```
