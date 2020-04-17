### 338. [Counting Bits](https://leetcode.com/problems/counting-bits/)
```javascript
/**
 * @param {number} num
 * @return {number[]}
 */
var countBits = function(num) {
  const ans = [0];
  for(let i = 1; i <= num; i++) {
    ans[i] = i % 2 == 0 ? ans[i] = ans[i/2] : ans[i-1] + 1;
  }
  return ans;
};

```
