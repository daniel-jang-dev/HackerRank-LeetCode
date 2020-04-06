### 980. [Unique Paths III](https://leetcode.com/problems/unique-paths-iii/)

```javascript
/**
 * @param {number[][]} grid
 * @return {number}
 */
var uniquePathsIII = function(grid) {
  
  const ans = {count : 0};
  let count = 0;
  const visited = grid.map(row => {
    const ar = [];
    row.forEach(cell => {
      ar.push(cell == 1); // set start point as `visited: true`, set others `visited: false`
      if(cell == 0 || cell == 2) // count the number of points to visit: 0, or 2
        count++;
    });
    return ar;
  });

  const start = getStartPoint(grid);
  backtrack(grid, visited, start[0], start[1], count, ans);
  return ans.count;
  
};

function getStartPoint(grid) {
  for(let i = 0; i < grid.length; i++) {
    for(let j = 0; j < grid[0].length; j++) {
      if(grid[i][j] == 1) {
        return [i, j];
      }
    }
  }
}

function backtrack(grid, visited, i, j, count, ans) {
  
  // base case
  if(count == 0) {
    ans.count++;
    return;
  };
         
  visited[i][j] = true; // move to point
  const nextPoints =  getNextPoints(grid, visited, i, j, count);
  for(let k = 0; k < nextPoints.length; k++) {
    const p = nextPoints[k];
    const nRI = p[0];
    const nCI = p[1];
    if(backtrack(grid, visited, nRI, nCI, count-1, ans)){
      return true;
    }
  }
  visited[i][j] = false; // empty the point
  return false;
}

function getNextPoints(grid, visited, rI, cI, count) {
  const points = [[rI+1, cI], [rI-1,cI], [rI,cI+1], [rI,cI-1]];
  const filtered = points.filter(a => {
    const i = a[0];
    const j = a[1];
    if(grid[i] === undefined || grid[i][j] === undefined) return false;
    const cell = grid[i][j];
    return !visited[i][j] && (count > 1 ? cell == 0 : cell == 2);
  });
  return filtered;
}
```
