### 79. [Word Search](https://leetcode.com/problems/word-search/)
```javascript
/**
 * @param {character[][]} board
 * @param {string} word
 * @return {boolean}
 */
var exist = function(board, word) {
  
  const visited = board.map(r => r.map(c => false));
  if(backtrack(board, word, visited, null, null)) {
    return true;
  }
  return false;
};

function backtrack(board, rest, visited, pi, pj) {
  
  if(rest.length == 0)
    return true;
  
  const nextPoints = getNextPoints(board, rest[0], visited, pi, pj);
  if(nextPoints.length == 0) 
    return;
  
  for(let k = 0; k < nextPoints.length; k++) {
    const point = nextPoints[k];
    const [i, j] = point;
    visited[i][j] = true;
    if(backtrack(board, rest.substring(1), visited, i, j)) {
      return true;
    }
    visited[i][j] = false;
  }
}

function getNextPoints(board, c, visited, pi, pj) {
  
  // startPoints
  if(pi == null && pj == null) {
    const startPoints = [];
    board.forEach((row, i) => {
      row.forEach((col, j) => {
        if(col == c)
          startPoints.push([i, j]);
      });
    });
    return startPoints;
  }
  
  const adjacentPoints = [ [pi+1, pj], [pi-1, pj], [pi, pj+1], [pi, pj-1]];
  return adjacentPoints.filter(point => {
    const [i, j] = point;
    if(board[i] == undefined || board[i][j] == undefined) return false;
    return !visited[i][j] && board[i][j] == c;
  })
}
```
