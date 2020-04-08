### 1266. [Minimum Time Visiting All Points](https://leetcode.com/problems/minimum-time-visiting-all-points/)
```javascript
/**
 * @param {number[][]} points
 * @return {number}
 */
var minTimeToVisitAllPoints = function(points) {
  
  let time = 0;
  for(let i = 0; i+1 < points.length; i++) {
    const curr = points[i];
    const next = points[i+1];
    const dx = Math.abs(curr[0]-next[0]);
    const dy = Math.abs(curr[1]-next[1]);
    time += Math.max(dx, dy);
  }
  return time;
};
```
