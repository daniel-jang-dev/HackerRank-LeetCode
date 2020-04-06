### 47. [Permutations II](https://leetcode.com/problems/permutations-ii/)

```javascript
/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var permuteUnique = function(nums) {
  const ans = new Set();
  backtrack(ans, '', nums);
  return [...ans].map(s => s.trim().split('  '));
};

function backtrack(ans, left, remains) {
  
  // base case
  if(!remains.length) {
    ans.add(left);
    return;
  }
  
  for(let i = 0; i < remains.length; i++) {
    const c = remains[i];
    const arr = [...remains];
    arr.splice(i, 1);
    backtrack(ans, left + c + '  ', arr);
  }
}
```
