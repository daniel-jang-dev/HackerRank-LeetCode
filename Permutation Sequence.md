### 60. [Permutation Sequence](https://leetcode.com/problems/permutation-sequence/)

```javascript
/**
 * @param {number} n
 * @param {number} k
 * @return {string}
 */
var getPermutation = function(n, k) {
  
  let str = '';
  for(let j = 1; j <=n; j++)
    str += j;
  
  let ans = '';
  let m = n - 1;
  
  let r = k - 1;
  while(str) {
    let i = factorial(m);
    const q = Math.floor(r / i);
    ans += str[q];
    str = str.substring(0, q) + str.substring(q+1);
    r = r % i;
    m--;
  }
  return ans;
};

function factorial(n) {
  const arr = [1, 1];
  for(let i = 2; i <= n; i++) {
    arr[i] = arr[i-1] * i;
  }
  return arr[n];
}
```
