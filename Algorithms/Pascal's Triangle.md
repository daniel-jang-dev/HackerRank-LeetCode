## [118. Pascal's Triangle](https://leetcode.com/problems/pascals-triangle/)
```javascript
// Runtime: 72 ms, faster than 90.73%
// Memory Usage: 38.4 MB, less than 63.14%
/**
 * @param {number} numRows
 * @return {number[][]}
 */
var generate = function(numRows) {
    
    const ans = [];
    if(numRows == 0) return ans;
    ans.push([1]);
    if(numRows == 1) return ans;
    
    ans.push([1, 1]);
    if(numRows == 2) return ans;
    
    let i = 3;
    while(i <= numRows) {
        const prev = ans[ans.length-1];
        const row = [1];
        for(let j = 1; j < prev.length; j++) {
            row.push(prev[j-1] + prev[j]);
        }
        row.push(1);
        ans.push(row);
        i++;
    }
    return ans;
    
};
```
