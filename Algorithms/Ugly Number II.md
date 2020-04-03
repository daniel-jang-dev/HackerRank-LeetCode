#### 264.[Ugly Number II](https://leetcode.com/problems/ugly-number-ii/)

```javascript
/**
 * @param {number} n
 * @return {number}
 */
var nthUglyNumber = function(n) {

  const target = 2123366400;
  const arr = [];
  
  let i = 1;
  while(i <= target) {
    arr.push(i);
    i *= 2;
  }
  arr.forEach((x, i, a) => {
    while(x * 3 <= target) {
      x *= 3;
      a.push(x);
    }
  });
  
  arr.forEach((x, i, a) => {
    while(x * 5 <= target) {
      x *= 5;
      a.push(x);
    }
  });
  return (arr.sort((a, b) => a-b))[n-1];
};
```
