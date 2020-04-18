### Week 3.2. [Valid Parenthesis String](https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/530/week-3/3301/)
```javascript
/**
 * @param {string} s
 * @return {boolean}
 */
var checkValidString = function(s) {
  let leftStack = [];
  let astStack = [];

  for (let i = 0; i < s.length; i++) {
    const c = s[i];
    if (c == '(') {
      leftStack.push(i);
    } else if (c == ')') {
      if (leftStack.length > 0)
        leftStack.pop();
      else if (astStack.length > 0)
        astStack.pop();
      else
        return false;
    } else { // '*'
      astStack.push(i);
    }
  }
  
  if (leftStack.length > astStack.length)
    return false;
  while (leftStack.length > 0) {
    if (leftStack.pop() > astStack.pop())
      return false;
  }
  return true;
};
```
