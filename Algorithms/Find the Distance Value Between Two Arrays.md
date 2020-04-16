### 1385. [Find the Distance Value Between Two Arrays](https://leetcode.com/problems/find-the-distance-value-between-two-arrays/)
```javascript
/**
 * @param {number[]} arr1
 * @param {number[]} arr2
 * @param {number} d
 * @return {number}
 */
var findTheDistanceValue = function(arr1, arr2, d) {
  const filtered = arr1.filter(x => arr2.every(y => Math.abs(x-y) > d));
  return filtered.length;
};
```
