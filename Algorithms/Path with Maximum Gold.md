### 1219. [Path with Maximum Gold](https://leetcode.com/problems/path-with-maximum-gold/)

```javascript
/**
 * @param {number[][]} grid
 * @return {number}
 */
var getMaximumGold = function(grid) {
  const ans = [];
  for(const r in grid) {
    for(const c in grid[r]) {
      const i = Number(r);
      const j = Number(c);
      const point = grid[i][j];
      if(point != 0) {
        const visited = grid.map(row => row.map(cell => false)); // Initiate `visited` for every starting point
        visited[i][j] = true;
        backtrack(ans, grid, visited, i, j, point, 1);
      }
    }
  }
  return Math.max(...ans);
  
};

function backtrack(ans, grid, visited, i, j, sum, count) {
  
  const nextPoints = getNextPoints(grid, visited, i, j);
  // Base case
  if(nextPoints.length == 0) {
    ans.push(sum);
    return;
  }
  
  nextPoints.forEach(pair => {
    const nI = pair[0];
    const nJ = pair[1];
    visited[nI][nJ] = true;
    const point = grid[nI][nJ];
    backtrack(ans, grid, visited, nI, nJ, sum + point, count + 1);
    visited[nI][nJ] = false;
  });
}

function getNextPoints(grid, visited, i, j) {
  const arr = [[i, j+1], [i, j-1], [i+1, j], [i-1, j]];
  return arr.filter(a => {
    const x = a[0];
    const y = a[1];
    if(grid[x] == undefined|| grid[x][y] == undefined) return false;
    return !visited[x][y] && grid[x][y] != 0;
  });
}
```
