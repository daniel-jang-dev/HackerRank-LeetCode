### 1079. [Letter Tile Possibilities](https://leetcode.com/problems/letter-tile-possibilities/)

```javascript
/**
 * @param {string} tiles
 * @return {number}
 */
var numTilePossibilities = function(tiles) {
  const ans = new Set();
  backtrack(tiles, '', ans);
  return ans.size;
};

function backtrack(right, left, ans) {
  
  if(!right && left) {
    ans.add(left);
    return;
  }
  
  for(let i = 0; i < right.length; i++) {
    const c = right[i];
    const newRight = right.substring(0, i) + right.substring(i+1);
    
    // Add c
    backtrack(newRight, left + c, ans);
    
    // Without c
    backtrack(newRight, left, ans);

  }
}

```
