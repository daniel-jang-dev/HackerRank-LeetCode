### Week 3.3. [Number of Islands](https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/530/week-3/3302/)
```javascript
/**
 * @param {character[][]} grid
 * @return {number}
 */
var numIslands = function(grid) {
  const checked = grid.map(row => row.map(cell => cell == '0'));
  let count = 0;
  for(let i = 0; i < grid.length; i++) {
    for(let j = 0; j < grid[0].length; j++) {
      if(checked[i][j]) continue;
      count++;
      bfs(i, j, grid, checked);
    }
  }
  return count;
};

let count = 0;

function bfs(i, j, grid, checked) {
  
  checked[i][j] = true;
  [[i, j+1], [i+1, j], [i, j-1], [i-1, j]].forEach(a => {
    const [x, y] = a;
    if(grid[x] != undefined && grid[x][y] != undefined && checked[x][y] == false) {
      bfs(x, y, grid, checked);
    }
  });
}
```
