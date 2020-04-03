### 1389. [Create Target Array in the Given Order](https://leetcode.com/problems/create-target-array-in-the-given-order/)

```javascript
/**
 * @param {number[]} nums
 * @param {number[]} index
 * @return {number[]}
 */
var createTargetArray = function(nums, index) {
  const arr = [];
  for(let i = 0; i < nums.length; i++) {
    arr.splice(index[i], 0, nums[i]);
  }
  return arr;
};
```
