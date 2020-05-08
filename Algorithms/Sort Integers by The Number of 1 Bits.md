### 1356. [Sort Integers by The Number of 1 Bits](https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/)
```javascript
/**
 * @param {number[]} arr
 * @return {number[]}
 */
var sortByBits = function(arr) {
  const dic = Array.from({ length: 14}, () => []);
  for(const n of arr) {
    const s = n.toString(2);
    const count = s.split('').filter(e => e == 1).length;
    dic[count].push(n);
  }
  const ans = [];
  dic.forEach(row => {
    if(row.length)
      ans.push(...row.sort((a,b) => a-b));
  });
  
  return ans;
};
```
