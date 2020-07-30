### 216. [Combination Sum III](https://leetcode.com/problems/combination-sum-ii/)
```javascript
/**
 * @param {number} k
 * @param {number} n
 * @return {number[][]}
 */
var combinationSum3 = function(k, n) {
  const nums = [];
  for(let i = 1; i <= 9; i++) {
    nums.push(i);
  }
  const ans = [];
  backtrack(ans, [], nums, n, k);
  return ans;
};

function backtrack(ans, sb, arr, target, k) {
  
  if(target == 0) {
    if(k == 0) {
      ans.push(sb); 
    }
    return;
  }
  
  if(target < 0) {
    return false;
  }
  
  arr.forEach(e => {
    backtrack(ans, [...sb, e], arr.filter(x => x > e), target-e, k-1);
  });
}
```
