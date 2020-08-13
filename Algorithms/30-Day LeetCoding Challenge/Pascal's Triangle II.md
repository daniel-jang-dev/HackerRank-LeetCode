## 2020 August 12, [Pascal's Triangle II](https://leetcode.com/explore/featured/card/august-leetcoding-challenge/550/week-2-august-8th-august-14th/3421/)

```javascript
/**
 * @param {number} rowIndex
 * @return {number[]}
 */
var getRow = function(rowIndex) {
    
    return Array.from({ length: rowIndex + 1 }, (_, i) => nCr(rowIndex, i));
};

function nCr(n, r) {
    if(n <= 1 || n == r || r == 0) return 1;
    if(n-r < r) return nCr(n, n-r);
    let i = 1;
    let ans = n;
    while(i < r) {
        n--;
        ans *= n;
        i++;
        ans /= i;
    }
    return ans;
}
```
