### 1351. [Count Negative Numbers in a Sorted Matrix](https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/)
```javascript
/**
 * @param {number[][]} grid
 * @return {number}
 */
var countNegatives = function(grid) {
  let count = 0;
  grid.forEach(row => {
    for(let i = row.length-1; i >= 0; i--) {
      if(row[i] >= 0) break;
      count++;
    }
  });
  return count;
};
```
