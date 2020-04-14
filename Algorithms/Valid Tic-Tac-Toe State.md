### 794. [Valid Tic-Tac-Toe State](https://leetcode.com/problems/valid-tic-tac-toe-state/)
```javascript
/**
 * @param {string[]} board
 * @return {boolean}
 */
var validTicTacToe = function(board) {
  
  let countX = 0;
  let countO = 0;
  board.forEach(row => {
    for(const c of row)
      if(c == 'X') countX++;
      else if(c == 'O') countO++;
  });
  if(countX < countO) return false;
  if(countX - countO > 1) return false;
  
  
  let winX = 0;
  let winO = 0;

  board.forEach(str => {
    
    if(str == 'XXX') winX++;
    else if(str == 'OOO') winO++;
  });
  for(let i = 0; i < 3; i++) {
    const c = board.map(s => s[i]);
    if(c.every(e => e == 'X')) winX++;
    else if(c.every(e => e == 'O')) winO++;
  }
  if(board[0][0] === 'X' && board[1][1] === 'X' && board[2][2] === 'X') winX++;
  if(board[0][0] === 'O' && board[1][1] === 'O' && board[2][2] === 'O') winO++;
  if(board[0][2] === 'X' && board[1][1] === 'X' && board[2][0] === 'X') winX++;
  if(board[0][2] === 'O' && board[1][1] === 'O' && board[2][0] === 'O') winO++;

  if(winX + winO == 0) return true;
  if(countX > countO) {
    return winO == 0;
  }
  if(countX  == countO) {
    return winX == 0;
  }
};
```
