## 1333. [Filter Restaurants by Vegan-Friendly, Price and Distance](https://leetcode.com/problems/filter-restaurants-by-vegan-friendly-price-and-distance/)
```
/**
 * @param {number[][]} restaurants
 * @param {number} veganFriendly
 * @param {number} maxPrice
 * @param {number} maxDistance
 * @return {number[]}
 */
var filterRestaurants = function(restaurants, veganFriendly, maxPrice, maxDistance) {
    return restaurants
            .filter(r => (veganFriendly ? r[2] : r) && r[3] <= maxPrice && r[4] <= maxDistance)
            .sort((a, b) => b[1] == a[1] ? b[0] - a[0] : b[1] - a[1])
            .map(r => r[0]);
};
```
