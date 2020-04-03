## 605. [Can Place Flowers](https://leetcode.com/problems/can-place-flowers/)

```
/**
 * @param {number[]} flowerbed
 * @param {number} n
 * @return {boolean}
 */
var canPlaceFlowers = function(flowerbed, n) {
  
  // LENGTH = 1;
  if(flowerbed.length == 1) {
    if(flowerbed[0] == 0) return n >= 0;
    return n == 0;
  } 
  
  // ALL zeros
  if(flowerbed.every(n => n==0)) {
    return Math.floor((flowerbed.length+1) / 2) >= n;
  }
  
  const consecutiveZeros = [];
  let count = 0;
  for(let i = 0; i < flowerbed.length; i++) {
    if(flowerbed[i] == 0) {
      count++;
    } else {
      consecutiveZeros.push(count);
      count = 0;
    }
  }
  consecutiveZeros.push(count); // push last one
  
  let total = 0;
  consecutiveZeros.forEach((e, i) => {
    if(e > 0) {
      if(i > 0 && i+1 < consecutiveZeros.length) {
        total += Math.floor((e-1) / 2);
      } else {
        total += Math.floor(e / 2);
      }      
    }
  });
  return total >= n;
};
```
