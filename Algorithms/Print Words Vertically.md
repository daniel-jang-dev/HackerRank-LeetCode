#### 1324. [Print Words Vertically](https://leetcode.com/problems/print-words-vertically)

```
/**
 * @param {string} s
 * @return {string[]}
 */
var printVertically = function(s) {
  const arr = s.split(' ');
  const max = Math.max(...arr.map(s => s.length));

  const result = [];
  for(let i = 0; i < max; i++) {
    let ans = '';
    arr.forEach(str => {
      const c = str[i] || ' ';
      ans += c;
    });
    result.push(ans.trimRight());
  };
  return result;
};
```
