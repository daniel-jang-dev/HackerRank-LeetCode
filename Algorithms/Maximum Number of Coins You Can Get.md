## 1561. [Maximum Number of Coins You Can Get](https://leetcode.com/problems/maximum-number-of-coins-you-can-get/)

```javascript
/**
 * @param {number[]} piles
 * @return {number}
 */
var maxCoins = function(piles) {
  let sum = 0;
  piles.sort((a, b) => a - b);
  const len = piles.length;
  for(let i = len / 3; i < len; i += 2) {
    sum += piles[i];
  }
  return sum;
};


/*
Example [2, 4, 1, 2, 7, 8]
SORT => 1,2,2,4,7,8
1. [1,7,8] => 7
2. [2,2,4] => 2

ans: 9
*/
```
