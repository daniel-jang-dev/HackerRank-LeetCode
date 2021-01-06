## [1572. Matrix Diagonal Sum](https://leetcode.com/problems/matrix-diagonal-sum/)
```javascript
// Runtime: 80 ms, faster than 73.10%
// Memory Usage: 40.8 MB, less than 20.41%
/**
 * @param {number[][]} mat
 * @return {number}
 */
var diagonalSum = function(mat) {
    
    const len = mat.length;
    let sum = 0;
    for(let i = 0; i < len; i++) {
        
        sum += mat[i][i];
        sum += mat[len-i-1][i];
    }
    if(len % 2) {
        const m = (len - 1) / 2;
        sum -= mat[m][m];
    }
    return sum;
};
```

```python
# Runtime: 84 ms, faster than 76.84%
# Memory Usage: 13.6 MB, less than 45.28%
class Solution(object):
    def diagonalSum(self, mat):
        """
        :type mat: List[List[int]]
        :rtype: int
        """
        sum = 0;
        ln = len(mat)
        for i in range(ln):
            sum += mat[i][i] + mat[i][-1-i];
        
        if ln % 2 == 1:
            m = (ln - 1) // 2
            sum -= mat[m][m]
            
        return sum
            
