### 43. [Multiply Strings](https://leetcode.com/problems/multiply-strings/)

```
/**
 * @param {string} num1
 * @param {string} num2
 * @return {string}
 */
var multiply = function(num1, num2) {
  
  if(Number(num1) == 0 || Number(num2)== 0) return '0';

  const a = num1.split('').reverse();
  const b = num2.split('').reverse();
  
  const ans = [];
  for(let i = 0; i < a.length; i++) {
    const m = Number(a[i]);
    for(let j = 0; j < b.length; j++) {
      const n = Number(b[j]);
      const mt = m * n + (ans[i+j] || 0);
      ans[i+j] = mt % 10;
      if(mt >= 10) {
        ans[i+j+1] = ans[i+j+1] + Math.floor(mt / 10) || Math.floor(mt / 10);
      }
    }
  }
  return ans.reverse().join('');
};
```
