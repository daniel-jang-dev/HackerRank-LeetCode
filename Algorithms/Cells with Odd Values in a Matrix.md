### 1252. [Cells with Odd Values in a Matrix](https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/)
```javascript
/**
 * @param {number} n
 * @param {number} m
 * @param {number[][]} indices
 * @return {number}
 */
var oddCells = function(n, m, indices) {
  const row = {};
  while(n) {
    row[n-1] = 0;
    n--;
  }
  const col = {};
  while(m) {
    col[m-1] = 0;
    m--;
  }
  indices.forEach(pair => {
    const [i, j] = pair;
    row[i]++;
    col[j]++;
  });
  return Object.values(row).filter(e => e % 2 == 1).length * Object.values(col).filter(e => e % 2 == 0).length + 
         Object.values(row).filter(e => e % 2 == 0).length * Object.values(col).filter(e => e % 2 == 1).length;
};
```
