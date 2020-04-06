### 212. [Word Search II](https://leetcode.com/problems/word-search-ii/)
```javascript
/**
 * @param {character[][]} board
 * @param {string[]} words
 * @return {string[]}
 */
var findWords = function(board, words) {
  return words.filter(word => isMatched(board, word));
};

function getMap1(board) { // Mapping for board
  const map = {};
  board.forEach(row => {
    row.forEach(c => {
      map[c] = map[c] + 1 || 1;
    });
  });
  return map;
}

function getMap2(word) { // Mapping for word
  const map = {};
  word.split('').forEach(c => {
    map[c] = map[c] + 1 || 1;
  });
  return map;
}

function isMatched(board, word) {

  // Check if word's length exceeds
  let count = 0;
  board.forEach(row => {
    row.forEach(c => {
      count++;
    });
  });
  if(word.length > count) return false;
  
  // Check if word's characters exceed
  const m1 = getMap1(board);
  const m2 = getMap2(word);
  const isValid = Object.keys(m2).every(c => m1[c] && m2[c] <= m1[c]);
  if(!isValid) return false;
  
  // Find start points
  const startPoints = getStartPoints(board, word);
  for(let k = 0; k < startPoints.length; k++) {
    const visited = board.map(row => row.map(e => false)); // Generate 'visited' grid for each starting point
    const p = startPoints[k];
    const i = p[0];
    const j = p[1];
    if(backtrack(board, visited, word, '', i, j, 0))
      return true;
  }
  return false;
}

function getStartPoints(board, word) {
  const list = [];
  if(!word) return list;
  board.forEach((row, i) => {
    row.forEach((c, j) => {
      if(c == word[0]) list.push([i, j]); // find points matching the word's first character
    });
  });
  return list;
}

function backtrack(board, visited, word, subs, i, j, index) {
  
  const c = board[i][j];
  subs += c;
  
  // base case
  if(index == word.length - 1) {
    return subs == word;
  }

  visited[i][j] = true;
  const nextPoints = getNextPoints(board, visited, i, j, index + 1, word);
  for(let k = 0; k < nextPoints.length; k++) {
    const p = nextPoints[k];
    const nRI = p[0];
    const nCI = p[1];
    if(backtrack(board, visited, word, subs, nRI, nCI, index + 1)){
      return true;
    }
  }
  visited[i][j] = false;
  return false;
}

// Get next points: Adjacent, not visited, matched the next character
function getNextPoints(board, visited, rI, cI, index, word) {
  const points = [[rI+1, cI], [rI-1,cI], [rI,cI+1], [rI,cI-1]];
  const filtered = points.filter(a => {
    const i = a[0];
    const j = a[1];
    if(board[i] === undefined || board[i][j] === undefined) return false;
    return !visited[i][j] && board[i][j] == word[index];
  });
  return filtered;
}
```
