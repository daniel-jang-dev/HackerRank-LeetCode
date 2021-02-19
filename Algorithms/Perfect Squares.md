## [279. Perfect Squares](https://leetcode.com/problems/perfect-squares/)
```javascript
// Runtime: 1576 ms, faster than 7.20%
// Memory Usage: 47.8 MB, less than 15.40%
/**
 * @param {number} n
 * @return {number}
 */
var numSquares = function(n) {
    
    const mem = [];
    
    function dp(n) {
        if(mem[n]) return mem[n];

        const squares = [];
        for(let i = 1; i* i <= n; i++)
            squares.push(i*i);
        if(squares.includes(n)) return 1;
        
        mem[n] = 1 + Math.min(...squares.map(e => dp(n - e)));
        return mem[n];
    }
    return dp(n);
};
```
