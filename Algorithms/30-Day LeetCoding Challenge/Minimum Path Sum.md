### Week 3.4. [Minimum Path Sum](https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/530/week-3/3303/)
```javascript
const minPathSum = grid => {
  
  for(var i = 0 ; i < grid.length; i++) {
    for(var j = 0 ; j < grid[0].length; j++) {
      if(grid[i-1] != undefined && grid[i][j-1] != undefined) {
        grid[i][j] = grid[i][j]+ Math.min(grid[i-1][j], grid[i][j-1]);
      } else if(grid[i-1] != undefined) {
        grid[i][j] = grid[i][j]+ grid[i-1][j];
      } else if(grid[i][j-1] != undefined) {
        grid[i][j] = grid[i][j]+ grid[i][j-1];
      }
    }
  }
  return grid[grid.length -1][grid[0].length -1];
};
```
