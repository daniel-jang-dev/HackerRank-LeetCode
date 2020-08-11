## 1387. [Sort Integers by The Power Value](https://leetcode.com/problems/sort-integers-by-the-power-value/)
```javascript
/**
 * @param {number} lo
 * @param {number} hi
 * @param {number} k
 * @return {number}
 */

// # 1.
var getKth = function(lo, hi, k) {
    
  if(lo == hi) return lo;
  
  const arr = [];
  for(let i = lo; i <= hi; i++) {
    arr.push({value: i, power: getPower(i)});
  }
  
  const ans = arr.sort((a,b) => {
    if(a.power == b.power) return a.value - b.value;
    return a.power - b.power;
  });
  
  return ans[k-1].value;
};

// # 2. 
var getKth = function(lo, hi, k) {
  const map = {};
  for(let i = lo; i <= hi; i++) {
    const power = getPower(i);
    if(!map[power]) map[power] = [];
    map[power].push(i);
  }
  const arr = [];
  Object.keys(map).sort((a, b) => a - b).forEach(key => arr.push(...map[key]));
  return arr[k-1];
};

// HELPER
function getPower(num) {
  
  let count = 0;
  while(num > 1) {
    if(num % 2) { // ODD
      num = num * 3 + 1;
    } else { // EVEN
      num /= 2;
    }
    count++;
  }
  return count;
}
```
