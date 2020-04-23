### 1399. [Count Largest Group](https://leetcode.com/problems/count-largest-group/)
```javascript
/**
 * @param {number} n
 * @return {number}
 */
var countLargestGroup = function(n) {
  let maxLen = 0;
  let maxCount = 0;
  const map = {};
  for(let i = 1; i <= n; i++) {
    let sum = 0;
    let k = i;
    const j = i;
    while(k) {
      sum += k % 10;
      k = Math.floor(k / 10);
    }
    if(map[sum] == undefined) {
      map[sum] = [];      
    }
    map[sum].push(j);
    const len = map[sum].length;
    if(len > maxLen) {
      maxLen = len;
      maxCount = 0;
    }
    if(len == maxLen) {
      maxCount++;
    }
  }
  return maxCount;
};
```
