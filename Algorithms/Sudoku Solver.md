### 37. [Sudoku Solver](https://leetcode.com/problems/sudoku-solver/) 

```javascript
/**
 * @param {character[][]} board
 * @return {void} Do not return anything, modify board in-place instead.
 */
var solveSudoku = function(board) {
  const counter = [];
  board.forEach(row =>  {
    row.forEach(d => {
      if(d == '.') {
        counter[0] = counter[0] + 1 || 1;
      } else {
       counter[d] = counter[d] + 1 || 1; 
      }
    });
  });
  
  for(let i = 0; i < board.length; i++) {
    for(let j = 0; j < board[i].length; j++) {
      backtrack(board, counter, i, j);
    }
  }
  return board;
};



function backtrack(board, counter, i, j) {
  
  // Base case
  if(counter[0] == 0) {
    return true;
  }
  
  if(j == board.length) { // End of row -> go to next row
    backtrack(board, counter, i+1, 0);
    return;
  }
  if(i == board.length) { // End of board -> go to first row
    backtrack(board, counter, 0, 0);
    return;
  }
  if(board[i][j] != '.') { // Check if is populated
    backtrack(board, counter, i, j+1);
    return;
  }
      
  for(let k = 1; k <= 9; k++) {
    if(counter[k] == 9) { // Check if the digit is left
      continue;
    }
    const val = String(k);
    if(hasConflict(i, j, board, val)) { // Check if it has conflict
      continue;
    }
    // TRY
    board[i][j] = val;
    counter[k] = counter[k] + 1 || 1; 
    counter[0]--;
    if(backtrack(board, counter, i, j+1)) {
      return true;
    }
    // REVERT
    board[i][j] = '.';
    counter[k]--; 
    counter[0]++;
  }
}

function hasConflict(rI, cI, board, curVal) {
  
  // ROW
  const row = board[rI];
  if(row.includes(curVal)) return true;
  
  // COL
  const col = board.map(row => row[cI]);
  if(col.includes(curVal)) return true;
  
  // Region
  const region = getRegion(rI, cI, board);
  for(let i = 0; i < region.length; i++) {
    for(let j = 0; j < region[i].length; j++) {
      if(region[i][j] == curVal) return true;
    }
  }  
  return false;
}

function getRegion(i, j, board) {
  const regionRI = Math.floor(i / 3);
  const regionCI = Math.floor(j / 3);
  const tempRows = board.filter((row, i) => Math.floor(i / 3) === regionRI);
  const region = tempRows.map(row => row.filter((c, i) => Math.floor(i / 3) === regionCI));
  return region;
}
```
