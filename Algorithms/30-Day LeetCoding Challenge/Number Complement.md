### 2020-05-04. [Number Complement](https://leetcode.com/explore/challenge/card/may-leetcoding-challenge/534/week-1-may-1st-may-7th/3319/)
```javascript
/**
 * @param {number} num
 * @return {number}
 */
var findComplement = function(num) {
  let exp = 1;
  while(num >= exp) {
    exp *= 2;
  }
  return exp - num - 1;
};
```
