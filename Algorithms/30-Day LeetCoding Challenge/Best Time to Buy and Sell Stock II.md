### Week 1.5. [Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)
```javascript
/**
 * @param {number[]} prices
 * @return {number}
 */
var maxProfit = function(prices) {
  let profit = 0;
  for(let i = 1; i < prices.length; i++) {
    if(prices[i-1] < prices[i]) {
      profit += prices[i] - prices[i-1];
    }
  }
  return profit;
};
```
