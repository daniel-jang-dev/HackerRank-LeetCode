## 858. [Mirror Reflection](https://leetcode.com/problems/mirror-reflection/)
```javascript
/**
 * @param {number} p
 * @param {number} q
 * @return {number}
 */
var mirrorReflection = function(p, q) {
  
  if(q == 0) return 2;
  
  if(p % q == 0) {
    return (p / q) % 2 == 0 ? 2 : 1;
  }
  
  let a = p, b = q;
  
  while(a % b > 0) {
    let tmp = a % b;
    a = b;
    b = tmp;
  }

  let x = p / b, y = q / b;

  if(x % 2) {
    if(y % 2) {
      return 1;
    } else {
      return 0;
    }
  } else {
    return 2;
  }
};
```
