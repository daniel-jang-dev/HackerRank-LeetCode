## [1390. Four Divisors](https://leetcode.com/problems/four-divisors/)

```
/**
 * @param {number[]} nums
 * @return {number}
 */
var sumFourDivisors = function(nums) {
    const arr = nums.map(n => getDivisors(n)).filter(a => a.length === 4);
    return arr.length > 0 ? 
      arr.map(row => row.reduce((a, b) => a + b)).reduce((a, b) => a + b) : 0;
};

function getDivisors(num) {
  const arr = [];
  let i;
  for(i = 1; i * i < num; i++) {
    if(num % i === 0) {
      arr.push(i, num / i);
    }
  }
  if(i * i === num) arr.push(i);
  return arr;
}
```
