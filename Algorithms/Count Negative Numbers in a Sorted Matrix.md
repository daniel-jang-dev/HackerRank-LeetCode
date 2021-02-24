### 1351. [Count Negative Numbers in a Sorted Matrix](https://leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/)
```javascript
// Brute force
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

// Binary Search
var countNegatives = function(grid) {
  
    function bs(arr) {
        if(arr[arr.length -1] >= 0) return 0;
        const n = arr.length;
        let l = 0, r = n - 1;
        while(l < r) {
            let mid = Math.floor((l + r) / 2);
            if(arr[mid] >= 0) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }
        return n - l;
    }
    
    let ans = 0;
    grid.forEach(row => {
       ans += bs(row);
    });
    return ans;  
};
```
