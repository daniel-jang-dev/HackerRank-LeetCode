## [888.Fair Candy Swap](https://leetcode.com/problems/fair-candy-swap/)
```javascript
// Runtime: 780 ms, faster than 16.57% 
// Memory Usage: 43.8 MB, less than 68.00% 
/**
 * @param {number[]} A
 * @param {number[]} B
 * @return {number[]}
 */
var fairCandySwap = function(A, B) {
    const sumA = A.reduce((a, b) => a + b);
    const sumB = B.reduce((a, b) => a + b);
    const diff = (sumA - sumB) / 2;
    
    const diffA = A.map(v => v - diff);
    
    for(let i = 0; i < B.length; i++) {
        const v = B[i];
        const j = diffA.indexOf(v);
        
        if(j != -1) return [A[j], v];
    }
};
```
