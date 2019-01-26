## 350. Intersection of Two Arrays II

> Given two arrays, write a function to compute their intersection.

###### Example 1:
```
Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
```
###### Example 2:
```
Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
```
###### Note:
- Each element in the result should appear as many times as it shows in both arrays.
- The result can be in any order.

## Solution

```javascript
/**
 * @param {number[]} nums1
 * @param {number[]} nums2
 * @return {number[]}
 */
var intersect = function(nums1, nums2) {
  
  let map1 = {}, map2 = {};
  nums1.forEach(key => {
    if(!map1[key]) map1[key] = 1;
    else map1[key]++;
  });
  nums2.forEach(key => {
    if(!map2[key]) map2[key] = 1;
    else map2[key]++;
  });
  result = [];
  Object.keys(map1).filter(key => map1[key] && map2[key]).forEach(key => {
    for(let i = 0; i < Math.min(map1[key], map2[key]); i++)
      result.push(Number(key));
  });
  return result;
};
```
