## [454. 4Sum II] (https://leetcode.com/problems/4sum-ii/)
```javascript
// Runtime: 432 ms, faster than 24.92%
// Memory Usage: 71.6 MB, less than 30.33%
/**
 * @param {number[]} A
 * @param {number[]} B
 * @param {number[]} C
 * @param {number[]} D
 * @return {number}
 */
var fourSumCount = function(A, B, C, D) {
    const AB = {};
    A.forEach(a => {
        B.forEach(b => {
            const sum = a + b;
            if(!AB[sum]) AB[sum] = 0;
            AB[sum]++;
        });
    });
    
    let ans = 0;
    C.forEach(c => {
        D.forEach(d => {
            const key = 0 - c - d;
            if(AB[key]) {
                ans += AB[key];    
            }
        });
    });
    return ans;
};
```

