## [1774. Closest Dessert Cost](https://leetcode.com/problems/closest-dessert-cost/)
```javascript
// Runtime: 84 ms, faster than 100.00% of JavaScript online submissions for Closest Dessert Cost.
// Memory Usage: 38.5 MB, less than 100.00%
/**
 * @param {number[]} baseCosts
 * @param {number[]} toppingCosts
 * @param {number} target
 * @return {number}
 */
var closestCost = function(baseCosts, toppingCosts, target) {
    
    let ans = Math.min(...baseCosts);
    
    function helper(price, i) {
        if(Math.abs(target - price) < Math.abs(target - ans)) {
            ans = price;
        }
        if(i == toppingCosts.length) return;
        
        const t = toppingCosts[i];
        helper(price , i + 1);
        helper(price + t, i + 1);
        helper(price + t * 2, i + 1);
    }
    
    for(let i = 0; i < baseCosts.length; i++) {
        var b = baseCosts[i];
        helper(b, 0);
    };
    
    return ans;
};

```
