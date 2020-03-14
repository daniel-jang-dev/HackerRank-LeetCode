## 1374. [Generate a String With Characters That Have Odd Counts](https://leetcode.com/problems/generate-a-string-with-characters-that-have-odd-counts/)


```
/**
 * @param {number} n
 * @return {string}
 */
var generateTheString = function(n) {
  
  if(n == 1) return 'a';
  if(n == 2) return 'ab';
  
  if(n % 2 == 1) {
    let s = 'ab', i = 2;
    while(i < n) {
      s += 'x';
      i++;
    }
    return s;
  } else {
    let s = 'a', i = 1;
    while(i < n) {
      s += 'x';
      i++;
    }
    return s;
  }
};
```
