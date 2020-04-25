### 1414. [Find the Minimum Number of Fibonacci Numbers Whose Sum Is K](https://leetcode.com/problems/find-the-minimum-number-of-fibonacci-numbers-whose-sum-is-k/)
```javascript
/**
 * @param {number} k
 * @return {number}
 */
var findMinFibonacciNumbers = function(k) {
  
  // Generate Fibonacci Array in reverse order
  const a = [1, 1]; 
  while(a[0] + a[1] <= k) {
    a.unshift(a[0] + a[1]);
  }
  
  // Count
  let count = 0;
  for(const n of a) {
    if(k == 0) break;
    if (k >= n) {
      k -= n;
      ++count;
    }
  }

  return count;
};

```
