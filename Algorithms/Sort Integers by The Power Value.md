## 1387. [Sort Integers by The Power Value](https://leetcode.com/problems/sort-integers-by-the-power-value/)
```
/**
 * @param {number} lo
 * @param {number} hi
 * @param {number} k
 * @return {number}
 */
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
