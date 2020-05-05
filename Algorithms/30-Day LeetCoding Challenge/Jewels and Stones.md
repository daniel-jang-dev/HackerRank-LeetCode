### 2020 May 2nd. [Jewels and Stones](https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3317/)
```javascript
/**
 * @param {string} J
 * @param {string} S
 * @return {number}
 */
var numJewelsInStones = function(J, S) {
  let count = 0;
  for(const c of S) {
    if(J.includes(c)) count++;
  }
  return count;
};
```
