## [1329. Sort the Matrix Diagonally](https://leetcode.com/problems/sort-the-matrix-diagonally/)
```javascript
// Runtime: 116 ms, faster than 20.85%
// Memory Usage: 43.4 MB, less than 18.28%
/**
 * @param {number[][]} mat
 * @return {number[][]}
 */
var diagonalSort = function(mat) {
    
    const m = mat.length;
    const n = mat[0].length;
    const ans = mat.map(row => []);
    
    const map = {};
    mat.forEach((row, r) => {
        let d;
        row.forEach((col, c) => {
            d = r - c;
            if(!map[d]) map[d] = [];
            map[d].push(col);
        });
    });
    
    Object.values(map).forEach(arr => {
        arr.sort((a, b) => b - a);
    })
    
    for(let i = 0; i < m; i++) {
        for(let j = 0; j < n; j++) {
            ans[i][j] = map[i - j].pop();
        }
    }
    return ans;
};
```
