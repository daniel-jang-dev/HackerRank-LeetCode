### 90. [Subsets II](https://leetcode.com/problems/subsets-ii/)

```javascript
/**
 * @param {number[]} nums
 * @return {number[][]}
 */
var subsetsWithDup = function(nums) {
  const ans = [];
  backtrack(nums, [], ans, 0);
  return ans;
};

function backtrack(nums, subset, ans, index) {
  
  // Base case
  if(index == nums.length) {
    if(isAddable(ans, subset)) {
     ans.push(subset); 
    }
    return;
  }
  
  // Without adding new element
  const s1 = [...subset];
  backtrack(nums, s1, ans, index + 1);
  
  // Adding new element
  const n = nums[index];
  const s2 = [...subset, n];
  backtrack(nums, s2, ans, index + 1);
}

function isAddable(arr, subset) {
  return arr.every(a => !hasSameElements(a, subset));
}

function hasSameElements(arr1, arr2) {
  const m1 = getMap(arr1);
  const m2 = getMap(arr2);
  return compareMaps(m1, m2);
}

function compareMaps(m1, m2) {
  if(Object.keys(m1).length != Object.keys(m2).length) return false;
  return Object.keys(m1).every(key => m1[key] == m2[key]);
}

function getMap(arr) {
  const m = {};
  arr.forEach(key => {
    m[key] = m[key] + 1 || 1;
  });
  return m;
}
```
