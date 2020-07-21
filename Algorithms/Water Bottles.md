## 1518. [Water Bottles](https://leetcode.com/problems/water-bottles/)

```javascript
/**
 * @param {number} numBottles
 * @param {number} numExchange
 * @return {number}
 */
var numWaterBottles = function(numBottles, numExchange) {

  let total = numBottles;
  
  let remainder = numBottles % numExchange;
  let newBottles = (numBottles - remainder) / numExchange;
  
  
  while(newBottles) {
    total += newBottles;
    numBottles = remainder + newBottles;
    remainder = numBottles % numExchange;
    newBottles = (numBottles - remainder) / numExchange;
  }
  
  return total;
};

```
