### 77. [Combinations](https://leetcode.com/problems/combinations/)
```javascript
/**
 * @param {number} n
 * @param {number} k
 * @return {number[][]}
 */
var combine = function(n, k) {
  const ans = [];
  const arr = Array.from({ length: n }, (_, i) => i+1); // Generate an array [1, 2, ..., n]
  backtracking(ans, [], arr, k);
  return ans;
};

function backtracking(ans, sb, arr, r) {
  
  // Base case
  if(r == 0) {
    ans.push(sb);
    return;
  }
  
  if(arr.length == r) {
    backtracking(ans, [...sb, ...arr], [], 0);
    return;
  }
  
  const [e, ...rest] = arr;
  backtracking(ans, [...sb, e], rest, r-1); // n-1 C r-1
  backtracking(ans, [...sb], rest, r); // n-1 C r
}
```
