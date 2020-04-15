### 306. [Additive Number](https://leetcode.com/problems/additive-number/)
```javascript
/**
 * @param {string} num
 * @return {boolean}
 */
var isAdditiveNumber = function(num) {
  
  if(num.length < 3) return false;
  
  const ans = { valid: false };
  backtrack(null, null, null, num, ans);
  return ans.valid;
};

function backtrack(n1, n2, n3, str, ans) {
  if(str.length == 0) {
    if(n1 + n2 == n3) {
      ans.valid = true;
    }
    return;
  }
  
  for(let i = 0; i < str.length; i++) {
    
    const n = Number(str.substring(0, i+1));
    if(n != 0 && str[0] == '0') continue; // leading zero
    const rest = str.substring(i+1);
    
    if(n1 == null) {
      backtrack(n, n2, n3, rest, ans);
    } else if(n2 == null) {
      backtrack(n1, n, n3, rest, ans);
    } else if(n3 == null) {
      backtrack(n1, n2, n, rest, ans);
    } else {
      if(n1 + n2 == n3)
        backtrack(n2, n3, n, rest, ans);
    }
  }
}
```
