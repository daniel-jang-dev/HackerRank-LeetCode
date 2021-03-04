## [1652. Defuse the Bomb](https://leetcode.com/problems/defuse-the-bomb/)
```javascript
// Runtime: 80 ms, faster than 86.31%
// Memory Usage: 39.1 MB, less than 38.17%
/**
 * @param {number[]} code
 * @param {number} k
 * @return {number[]}
 */
var decrypt = function(code, k) {
    
    if(k == 0) return code.map(_ => 0);
    
    const l = code.length;
    
    const ans = [];
    for(let i = 0; i < l; i++) {
        
        let sum = 0;
        if(k > 0) {
            for(let j = 1; j <= k; j++) {
                sum += code[(i + j) % l];
            }
            
        } else {
            for(let j = -1; j >= k; j--) {
                sum += code[(i + j + l) % l];
            }
        }
        ans[i] = sum;
        
    }
    return ans;
};
```
