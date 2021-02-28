## [1463. Cherry Pickup II](https://leetcode.com/problems/cherry-pickup-ii/)
```javascript
// Runtime: 516 ms, faster than 21.16%
// Memory Usage: 60.4 MB, less than 30.73%
/**
 * @param {number[][]} grid
 * @return {number}
 */
var cherryPickup = function(grid) {
    
    const r = grid.length;
    const c = grid[0].length;
    const mem = {};
    
    function helper(i, j1, j2) {
        
        const key = '_'+i+'_'+j1+'_'+j2;
        // use mem if exists
        if(mem[key]) return mem[key];
                
        // out of bound
        if(j1 < 0 || j1 >= c  || j2 < 0 || j2 >= c) return 0;
        
        // pick cherries in current row
        let ans = 0;
        ans += grid[i][j1];
        if(j1 != j2) 
            ans += grid[i][j2];
        
        // end of grid 
        if(i == r - 1) {
            mem[key] = ans;
            return ans;
        }
        
        // next lines
        const arr = [];
        for(let p = j1 - 1; p <= j1 + 1; p++) {
            for(let q = j2 - 1; q <= j2 + 1; q++) {
                arr.push(helper(i+1, p, q));
            }
        }
        ans += Math.max(...arr);
        mem[key] = ans;
        return ans;
    }
    
    return helper(0, 0, c-1);
};
```
