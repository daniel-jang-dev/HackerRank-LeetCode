### 1394.[Find Lucky Integer in an Array](https://leetcode.com/problems/find-lucky-integer-in-an-array/)

```
/**
 * @param {number[]} arr
 * @return {number}
 */
var findLucky = function(arr) {
  
  const m = {};
  arr.forEach(key => {
    m[key] = m[key] + 1 || 1;
  });
  const tmp = Object.entries(m).filter(a => a[0] == a[1]);
  if(!tmp.length) return -1;
  return (tmp.sort((a,b) =>b[0]-a[0]))[0][1];
};
```
