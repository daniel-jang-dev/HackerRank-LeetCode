### 36. [Valid Sudoku](https://leetcode.com/problems/valid-sudoku/)
```javascript
/**
 * @param {character[][]} board
 * @return {boolean}
 */
var isValidSudoku = function(board) {
  
  // ROW
  const isValid1 = board.every(row => hasNoRepetition(row));
  if(!isValid1) return false;
  
  // COLUMN
  const cols = [];
  for(let i = 0; i < board.length; i++) {
    const col = board.map(row => row[i]);
    cols.push(col);
  };
  const isValid2 = cols.every(col => hasNoRepetition(col));
  if(!isValid2) return false;

  // SUB-BOX (REGION)
  const regions = [];
  for(let i = 0; i < board.length; i += 3) {
    for(let j = 0; j < board.length; j += 3) {
      const regionArr = getRegionItems(i, j, board);
      console.log(regionArr);
      regions.push(regionArr);
    }
  }
  const isValid3 = regions.every(col => hasNoRepetition(col));
  return isValid3;
};

function hasNoRepetition(arr) {
  const m = [];
  for(let i = 0; i <= arr.length; i++) {
    const n = arr[i];
    if(n == '.') continue;
    if(!m[n]) {
      m[n] = 1;
    } else {
      return false;
    }
  }
  return true;
}

function getRegionItems(i, j, board) {
  const regionRI = Math.floor(i / 3);
  const regionCI = Math.floor(j / 3);
  const tempRows = board.filter((row, i) => Math.floor(i / 3) === regionRI);
  const region = tempRows.map(row => row.filter((c, i) => Math.floor(i / 3) === regionCI));
  return [...region[0], ...region[1], ...region[2]]; // Flatten 2D array
}
```
