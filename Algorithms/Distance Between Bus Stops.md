##[1184. Distance Between Bus Stops](https://leetcode.com/problems/distance-between-bus-stops/)
```javascript
// Runtime: 80 ms, faster than 57.45%
// Memory Usage: 38.6 MB, less than 75.53%
/**
 * @param {number[]} distance
 * @param {number} start
 * @param {number} destination
 * @return {number}
 */
var distanceBetweenBusStops = function(distance, start, destination) {
    
    const sum = distance.reduce((a, b) => a + b);
    let c = 0;
    for(let i = Math.min(start, destination); i < Math.max(start, destination); i++) {
        c += distance[i];
    }
    return Math.min(sum - c, c);
};
```

```python
# Runtime: 44 ms, faster than 78.19%
# Memory Usage: 15.2 MB, less than 28.08%
class Solution:
    def distanceBetweenBusStops(self, distance: List[int], start: int, destination: int) -> int:
        s = min(start, destination)
        d = max(start, destination)
        total = sum(distance[:])
        clockwise = sum(distance[s:d])
        counter_clockwise = total - clockwise
        return min(counter_clockwise, clockwise)
```
