## [1535. Find the Winner of an Array Game](https://leetcode.com/problems/find-the-winner-of-an-array-game/)
```javascript
// Runtime: 96 ms, faster than 64.29% of JavaScript
// Memory Usage: 49.7 MB, less than 14.29% of JavaScript
/**
 * @param {number[]} arr
 * @param {number} k
 * @return {number}
 */
var getWinner = function(arr, k) {
    
    const len = arr.length;
    
    if(k >= len-1) return Math.max(...arr);
    
    let wI = 0, count = 0;
    
    for(let i = 1; i < len; i = (i + 1) % len) {
        
        if(arr[wI] < arr[i]) {
            wI = i;
            count = 1;
        } else {
            count++;
        }
        if(count == k) return arr[wI];
    }
};
```
