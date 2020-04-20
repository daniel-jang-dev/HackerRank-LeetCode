### 1137. [N-th Tribonacci Number](https://leetcode.com/problems/n-th-tribonacci-number/)
```javascript
/**
 * @param {number} n
 * @return {number}
 */
function tribonacci(n) {
  const a = [0,1,1];
  for(let i = 3; i <= n; i++)
    a[i] = a[i-1] + a[i-2] + a[i-3];
  return a[n];
};
```
