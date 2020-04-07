### 39. [Combination Sum](https://leetcode.com/problems/combination-sum/)
```javascript
/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum = function(candidates, target) {
  const ans = [];
  backtrack(ans, [], candidates, target);
  return ans;
};

function backtrack(ans, ar, candidates, target) {
  
  if(target == 0) {
    ans.push(ar);
    return;
  }

  if(target < 0) {
    return false;
  }
  
  for(const n of candidates) {
    backtrack(ans, [...ar, n], candidates.filter(e => e >= n), target-n);
  }
}
```
