### 1200. [Minimum Absolute Difference](https://leetcode.com/problems/minimum-absolute-difference/)
```javascript
/**
 * @param {number[]} arr
 * @return {number[][]}
 */
var minimumAbsDifference = function(arr) {
  const sorted = arr.sort((a, b) => a - b);
  let ans = [[sorted[0], sorted[1]]];
  let minDiff = sorted[1] - sorted[0];
  for(let i = 1; i+1 < sorted.length; i++) {
    const diff = sorted[i+1] - sorted[i];
    const pair = [sorted[i], sorted[i+1]];
    if(diff < minDiff) {
      minDiff = diff;
      ans = [pair];
    } else if (diff == minDiff) {
      ans.push(pair);
    }
  }
  return ans;
};
```
