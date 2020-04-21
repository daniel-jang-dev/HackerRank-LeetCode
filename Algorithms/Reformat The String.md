### 1417. [Reformat The String](https://leetcode.com/problems/reformat-the-string/)
```javascript
/**
 * @param {string} s
 * @return {string}
 */
var reformat = function(s) {
  
  let alpha = '';
  let numeric = '';
  
  for(const c of s) {
    isNaN(c) ? alpha += c : numeric += c;
  }
  if(Math.abs(alpha.length - numeric.length) > 1) {
    return '';
  }
  let ans = '';
  
  if(alpha.length > numeric.length) {
    ans += alpha[0];
    for(let i = 0; i < numeric.length; i++) {
      ans += numeric[i] + alpha[i+1];
    }
    return ans;
  }
  
  if(alpha.length < numeric.length) {
    ans += numeric[0];
    for(let i = 0; i < alpha.length; i++) {
      ans += alpha[i] + numeric[i+1];
    }
    return ans;
  }
  
  for(let i = 0; i < alpha.length; i++) {
    ans += alpha[i] + numeric[i];
  }
  return ans;
};
```
