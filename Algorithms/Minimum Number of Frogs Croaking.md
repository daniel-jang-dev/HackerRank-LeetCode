### 1419. [Minimum Number of Frogs Croaking](https://leetcode.com/problems/minimum-number-of-frogs-croaking/)
```javascript
/**
 * @param {string} croakOfFrogs
 * @return {number}
 */
var minNumberOfFrogs = function(croakOfFrogs) {
  
  const len = croakOfFrogs.length;
  if(len % 5) return -1;
  
  let max = 0;
  let count = 0;
  const m = { 'c': 0, 'r': 1, 'o': 2, 'a': 3, 'k': 4 };
  const arr = [[], [], [], [], []]; // c r o a k
  
  // Count letter
  for(let i = 0; i < len; i++) {
    const c = croakOfFrogs[i];
    const index = m[c];
    if(index > 0 && arr[index-1].length <= arr[index].length) return -1; // check order
    if(c == 'c') {
      count++;
      max = Math.max(count, max);
    } else if(c == 'k') {
     count --; 
    }
    arr[index].push(i);
  }
  
  if(arr.some(a => a.length != len / 5)) return -1; // check number of each letter
  return max;
};
```
