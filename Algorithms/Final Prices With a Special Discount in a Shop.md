## [1475. Final Prices With a Special Discount in a Shop](https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/submissions/)
```javascript
// Runtime: 92 ms, faster than 45.97% 
// Memory Usage: 40.8 MB, less than 19.80%
/**
 * @param {number[]} prices
 * @return {number[]}
 */
var finalPrices = function(prices) {
    const len = prices.length;
    for(let i = 0; i < len - 1; i++) {
        for(let j = i+1; j < len; j++) {
            if(prices[j] <= prices[i]) {
                prices[i] -= prices[j];
                break;
            }
        }
    }
    return prices;
};
```
