### 1275. [Find Winner on a Tic Tac Toe Game](https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/)
```javascript
/**
 * @param {number[][]} moves
 * @return {string}
 */
var tictactoe = function(moves) {
  const grid = [
    [null, null, null],
    [null, null, null],
    [null, null, null]
  ];
  for(let t = 0; t < moves.length; t++) {
    const i = moves[t][0];
    const j = moves[t][1];
    const key = t % 2 == 0 ? 'A' : 'B';
    grid[i][j] = key;
    if(isWinner(key, grid))
      return key;
  }
  if(grid.every(row => row.every(cell => cell != null)))
    return 'Draw';
  
  return 'Pending';
};

function isWinner(key, grid) {
  
  if (grid.some(row => row.every(e => e == key)))
    return true;
  
  const cols = [];
  let i = 0;
  while(i < 3) {
    const col = [];
    grid.forEach(row => {
      col.push(row[i]);
    });
    cols.push(col);
    i++;
  }
  
  if(cols.some(col => col.every(e => e == key)))
    return true;
  
  if([grid[0][0], grid[1][1], grid[2][2]].every(e => e == key))
    return true;
  
  if([grid[0][2], grid[1][1], grid[2][0]].every(e => e == key))
    return true;

  return false;
}
```
