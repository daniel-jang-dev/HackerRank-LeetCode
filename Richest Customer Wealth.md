## 1672. [Richest Customer Wealth](https://leetcode.com/problems/richest-customer-wealth/)

> - Runtime: 72 ms, faster than 93.79% of JavaScript online submissions for Richest Customer Wealth.
> - Memory Usage: 38.5 MB, less than 67.52% of JavaScript online submissions for Richest Customer Wealth.

```javascript
/**
 * @param {number[][]} accounts
 * @return {number}
 */
var maximumWealth = function(accounts) {
  
  let max = sum(accounts[0]);
  for(const row of accounts) {
    const s = sum(row);
    max = max < s ? s : max;
  }
  return max;
  
  function sum(arr) {
    return arr.reduce((a, b) => a + b)
  }
};

```
