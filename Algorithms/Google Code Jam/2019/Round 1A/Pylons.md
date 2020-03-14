## [Pylons](https://codingcompetitions.withgoogle.com/codejam/round/0000000000051635/0000000000104e03)
```
const fs= require('fs');

const input = fs.readFileSync(0,'utf8').trim().split('\n').slice(1);

console.log(input.map((e,i)=>`Case #${i+1}: ${solve(e)}`).join('\n'));

function solve(str) {
    [r, c] = str.split(' ');
    const board = initateBoard(r, c);
    const ans = [];
    const res = place(null, null, board, r * c, ans);
    if(res) {
        return 'POSSIBLE\n' + ans.map(e => `${e.x} ${e.y}`).join('\n');
    } else {
        return 'IMPOSSIBLE';
    }
}

function initateBoard(row, col) {
    return Array.from({length: row}, () => Array.from({length: col}, () => 0));
}

function place(pR, pC, board, N, ans) {

	if(N == 0) return true;

	for(let row = 0; row < board.length; row++) {
	    if(row == pR) continue;
		for(let col = 0; col < board[row].length; col++) {
			if(hasConflict(pR, pC, row, col, board)) {
				continue;
			}
			board[row][col] = 1;
			if(place(row, col, board, N-1, ans)) {
				ans.unshift({x: Number(row) + 1, y : Number(col) + 1});
				return true;
			}
			board[row][col] = 0;
		}
	}
	return false;
}

function hasConflict(pR, pC, cR, cC, board) {

	if(pR == null && pC == null) return false;

	if(board[cR][cC]) return true;
	if(pR == cR) return true;
	if(pC == cC) return true;
	if(Number(pR) + Number(pC) == Number(cR) + Number(cC)) return true;
	if(pR - pC == cR - cC) return true;
	return false;
}
```
