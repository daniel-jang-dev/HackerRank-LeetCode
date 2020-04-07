### Day-07 [Counting Elements](https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/528/week-1/3289/)
```javascript
/**
 * @param {number[]} arr
 * @return {number}
 */
var countElements = function(arr) {
  const m = {};
  arr.sort((a,b) => a-b).forEach(key => {
    m[key] = m[key] + 1 || 1;
  });
  let sum = 0;
  Object.keys(m).forEach(c => {
    const i = Number(c);
    if(m[i+1]) {
      sum += m[i];
    }
  });
  return sum;
};
```
