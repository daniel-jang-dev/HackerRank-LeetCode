### Week 1.2. [Happy Number](https://leetcode.com/explore/featured/card/30-day-leetcoding-challenge/528/week-1/3284/)
```javascript
/**
 * @param {number} n
 * @return {boolean}
 */
var isHappy = function(n) {
  let curr = n;
  const arr = []; // to check infinite loop
  while(curr > 1) {
    const next = String(curr).split('').map(s => Number(s)).map(n => n*n).reduce((a, b) => a + b);
    console.log(next);
    if(curr == next || arr.includes(next)) {
      return false;
    }
    curr = next;
    arr.push(curr);
  }
  return curr == 1; 
};
```
