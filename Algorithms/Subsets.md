### 78. [Subsets](https://leetcode.com/problems/subsets/submissions/)

```javascript
/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsets = function(nums) {
  const ans = [];
  backtrack(nums, [], ans, 0);
  return ans;
};

function backtrack(nums, subA, arr, index) {
  
  if(index == nums.length) {
    arr.push(subA);
    return;
  }

  // New element added to subset
  backtrack(nums, [...subA, nums[index]], arr, index+1);
   
  // New element NOT added to subset
  backtrack(nums, subA, arr, index+1);
}
```
