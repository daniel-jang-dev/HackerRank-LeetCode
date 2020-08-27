## 459. [Repeated Substring Pattern](https://leetcode.com/problems/repeated-substring-pattern/)

```javascript
/**
 * @param {string} s
 * @return {boolean}
 */
var repeatedSubstringPattern = function(s) {
  let p = 1;
  const len = s.length;
  while(p <= len / 2) {
    if(len % p === 0) {
      let q = len / p;
      const subs = s.substring(0, p);
      let r = '';
      while(q) {
        r += subs;
        q--;
      }
      if(r == s) return true;
    }
    p++;
  }
  return false;
};
```
