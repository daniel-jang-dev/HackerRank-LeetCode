### 40. [Combination Sum II](https://leetcode.com/problems/combination-sum-ii/)

```javascript
/**
 * @param {number[]} candidates
 * @param {number} target
 * @return {number[][]}
 */
var combinationSum2 = function(candidates, target) {
  const ans = [];
  backtrack(ans, [], candidates.sort((a,b) => a-b), target);
  return ans;
};

function backtrack(ans, sb, nums, target) {

  if(target == 0) {
    ans.push(sb);
    return;
  }
  
  if(target < 0) {
    return false;
  }
  
  for(let i = 0; i < nums.length; i++) {
    if(i > 0 && nums[i-1] == nums[i]) continue;
    const n = nums[i];
    const ar = [...nums];
    ar.splice(i, 1);
    backtrack(ans, [...sb, n], ar.filter(x => x >= n), target - n);
  } 
}
```
