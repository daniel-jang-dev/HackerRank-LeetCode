### Week 2.2. [Backspace String Compare](https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/529/week-2/3291/)
```javascript
/**
 * @param {string} S
 * @param {string} T
 * @return {boolean}
 */
var backspaceCompare = function(S, T) {
  const s = helper(S);
  const t = helper(T);
  return s == t;
};

function helper(str) {

  let result = '';
  
  for(let i = 0; i < str.length; i++) {
    const c = str[i];
    if(c == '#') {
      result = result.substring(0, result.length - 1);
    } else {
      result += c;
    }
  }
  return result;
}
```
