## [1779. Find Nearest Point That Has the Same X or Y Coordinate](https://leetcode.com/problems/find-nearest-point-that-has-the-same-x-or-y-coordinate/)
```javascript
// Runtime: 116 ms, faster than 100.00%
// Memory Usage: 46.7 MB, less than 100.00%
/**
 * @param {number} x
 * @param {number} y
 * @param {number[][]} points
 * @return {number}
 */
var nearestValidPoint = function(x, y, points) {
    
    let ans = -1;
    let min = 2 * 10 ** 4;
    for(let i = 0; i < points.length; i++) {
        const [xi, yi] = points[i];
        if(xi == x || yi == y) {
            const manhattanDistance = Math.abs(x - xi) + Math.abs(y - yi);
            if (manhattanDistance < min) {
                min = manhattanDistance;
                ans = i;
            }
        }
    }
    return ans;
};
```
