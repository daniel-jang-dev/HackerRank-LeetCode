## [1624.Largest Substring Between Two Equal Characters](https://leetcode.com/problems/largest-substring-between-two-equal-characters/)

>Runtime: 84 ms, faster than 100.00% of JavaScript online submissions for Largest Substring Between Two Equal Characters.
> Memory Usage: 40 MB, less than 100.00% of JavaScript online submissions for Largest Substring Between Two Equal Characters.

```javascript

/**
 * @param {string} s
 * @return {number}
 */
var maxLengthBetweenEqualCharacters = function(s) {

  const map ={};
  for(let i in s) {
    const c = s[i];
    if(!map[c]) {
      map[c] = [];
    }
    map[c].push(i);
  }

  const diff = Object.values(map).map(ar => {
    
    const first = ar[0];
    const last = ar[ar.length-1];
    return last - first - 1;
  });

  return Math.max(...diff);
};
```
