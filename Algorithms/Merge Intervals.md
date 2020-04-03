## 56. [Merge Intervals](https://leetcode.com/problems/merge-intervals/)

```
/**
 * @param {number[][]} intervals
 * @return {number[][]}
 */
var merge = function(intervals) {
  const sA = intervals.map(a => a[0]).sort(((a,b)=>a-b));
  const eA = intervals.map(a => a[1]).sort(((a,b)=>a-b));

  let i = 0;
  let j = 0;
  const l = intervals.length;
  
  let count = 0;
  const result = [];
  let tempA = [];
  while(!(i == l && j == l)) {
    
    if(i == l) {
      tempA.push(eA[j]);
      j++;
      count--;
    } else if(j == i) {
      tempA.push(sA[i]);
      i++;
      count++;
    } else {
      const s = sA[i];
      const e = eA[j];
      if(s < e) {
        tempA.push(s);
        i++;
       count++;
      } else if(s > e) {
        tempA.push(e);
        j++;
        count--;
      } else {
        i++;
        j++;
      }
    }
    
    if(count == 0) {
      result.push([tempA.shift(), tempA.pop()]);
      tempA = [];
    }
  }
  return result;
};
```
