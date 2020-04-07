### 46. [Permutations](https://leetcode.com/problems/permutations/)

```javascript
/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var permute = function(nums) {
  const ans = [];
  backtrack(ans, [], nums, nums.length);
  return ans;
};

function backtrack(ans, subA, nums, count) {

  // Base case
  if(count == 0) {
    ans.push(subA);
    return;
  }
  
  for(let i = 0; i < nums.length; i++) {
    const sb = [...subA, nums[i]];
    const nNums = [...nums];
    nNums.splice(i, 1);
    backtrack(ans, sb, nNums, count-1);
  }
  
}
```
