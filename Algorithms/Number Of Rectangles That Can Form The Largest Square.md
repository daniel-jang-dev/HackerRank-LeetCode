## [1725. Number Of Rectangles That Can Form The Largest Square](https://leetcode.com/problems/number-of-rectangles-that-can-form-the-largest-square/)
```javascript
// Runtime: 80 ms, faster than 100.00%
// Memory Usage: 41.3 MB, less than 100.00%
/**
 * @param {number[][]} rectangles
 * @return {number}
 */
var countGoodRectangles = function(rectangles) {
    
    let count = 1;
    let maxSize = Math.min(...rectangles[0]);
    
    for(let i = 1; i < rectangles.length; i++) {
        
        const newSize = Math.min(...rectangles[i]);
        
        if (maxSize < newSize) {
            maxSize = newSize;
            count = 1;
            
        } else if (maxSize == newSize) {
            count++;
        }
    }
    return count;
};
```
