## 1486. [XOR Operation in an Array](https://leetcode.com/problems/xor-operation-in-an-array/)
```javascript
var xorOperation = function(n, start) {
  
  let ans = start;
  for(let i = start + 2; i < start + 2 * n; i += 2 ) {
    ans = ans ^ i;
  }
  return ans;
};
```
