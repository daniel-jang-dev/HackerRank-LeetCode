### [Pascal's Triangle II](https://leetcode.com/explore/learn/card/recursion-i/251/scenario-i-recurrence-relation/3234/)
```javascript
/**
 * @param {number} rowIndex
 * @return {number[]}
 */
var getRow = function(rowIndex) {
  if(rowIndex == 0) return [1];
  if(rowIndex == 1) return [1, 1];
  
  let i = 2;
  let arr = [1,2,1];
  while(i < rowIndex) {
    arr = helper(arr);
    i++;
  }
  return arr;
};

function helper(arr) {
  const len = arr.length;
  const res = [1];
  for(let i = 1; i < len; i++) {
    res.push(arr[i-1]+arr[i]);
  }
  res.push(1);
  return res;
}
```
