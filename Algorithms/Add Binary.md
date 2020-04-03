### 67. [Add Binary](https://leetcode.com/problems/add-binary/)

```
/**
 * @param {string} a
 * @param {string} b
 * @return {string}
 */
var addBinary = function(a, b) {
  const a1 = a.split('').reverse();
  const a2 = b.split('').reverse();
  const ans = [];
  for(let i = 0; i < Math.max(a1.length, a2.length); i++) {
    
    const sum = Number(a1[i] || 0) + Number(a2[i] || 0) + (ans[i] || 0);
    ans[i] = sum % 2;
    if(sum > 1) {
      ans[i+1] = 1;
    }
  };
  return ans.reverse().join('');
};
```
