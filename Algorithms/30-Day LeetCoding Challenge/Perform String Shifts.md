### Week 2.7. [Perform String Shifts](https://leetcode.com/explore/challenge/card/30-day-leetcoding-challenge/529/week-2/3299/)
```javascript
/**
 * @param {string} s
 * @param {number[][]} shift
 * @return {string}
 */
var stringShift = function(s, shift) {
  let sum = 0;
  shift.forEach(e => {
    if(e[0] == 0) {
      sum += e[1];
    } else {
      sum -= e[1];
    }
  });
  let res = '';
  const len = s.length;
  while(sum < 0) {
    sum += len;
  }
  let i = sum;
  let count = len;
  while(count > 0) {
    res += s[i % len];
    i++;
    count--;
  }
  return res;
};
```
