### Week 3.7. [Leftmost Column with at Least a One](https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/530/week-3/3306/)
```javascript
/**
 * // This is the BinaryMatrix's API interface.
 * // You should not implement it, or speculate about its implementation
 * function BinaryMatrix() {
 *     @param {integer} x, y
 *     @return {integer}
 *     this.get = function(x, y) {
 *         ...
 *     };
 *
 *     @return {[integer, integer]}
 *     this.dimensions = function() {
 *         ...
 *     };
 * };
 */

/**
 * @param {BinaryMatrix} binaryMatrix
 * @return {number}
 */
var leftMostColumnWithOne = function(bm) {
  const [m, n] = bm.dimensions();
  let r = 0;
  let c = n-1;
  while(r < m && c > -1) {
    if(c == -1) return 0;
    bm.get(r, c) == 1 ? c-- : r++;
  }
  
  if(c == n-1) return -1;
  return c+1;
};


```
