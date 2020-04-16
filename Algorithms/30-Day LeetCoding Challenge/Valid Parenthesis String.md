### Week 3.2. [Valid Parenthesis String](https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/530/week-3/3301/)
```javascript
/**
 * @param {string} s
 * @return {boolean}
 */
let ans = false;

var checkValidString = function(s) {
  backtrack(s, 0);
  return ans;
};

function backtrack(s, count) {
  
  // Base case
  if(s == '') {
    if(count == 0) ans = true;
    return;
  }
  
  if(count < 0)
    return;
  
  const c = s[0];
  const rest = s.substring(1);
  switch(c) {
    case '(':
      backtrack(rest, count + 1);
      break;
    case ')':
      backtrack(rest, count - 1);
      break;
    default: // '*'
      backtrack(rest, count);   // empty string
      backtrack(rest, count + 1); // '('
      backtrack(rest, count - 1); // ')'
  }
}
```
